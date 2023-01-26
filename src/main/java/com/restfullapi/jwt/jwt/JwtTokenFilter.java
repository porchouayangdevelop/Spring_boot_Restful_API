package com.restfullapi.jwt.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.restfullapi.jwt.services.myCustomUserDetailsService;

public class JwtTokenFilter extends OncePerRequestFilter {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(JwtTokenFilter.class);

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private myCustomUserDetailsService myCustomUserDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = parseJwt(request);
        try {
            if (token != null && jwtUtil.validateToken(token)) {

                String username = jwtUtil.getUsernameFormJwtToken(token);
                UserDetails userDetails = myCustomUserDetailsService.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                authenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails((HttpServletRequest) request));

                SecurityContextHolder.getContext().setAuthentication(authenticationToken);

            }
        } catch (Exception e) {
            logger.error("cannot set user authentication :{}", token, e.getMessage());
        }
        filterChain.doFilter(request, response);
    }

    private String parseJwt(ServletRequest request) {

        String HeaderAuth = ((HttpServletRequest) request).getHeader("Authorization");
        if (StringUtils.hasText(HeaderAuth) && HeaderAuth.startsWith("Bearer ")) {
            return HeaderAuth.substring(7, HeaderAuth.length());

        }
        return HeaderAuth;

    }
}
