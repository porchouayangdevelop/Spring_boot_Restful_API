package com.restfullapi.jwt.jwt;

import java.util.Date;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.restfullapi.jwt.models.userPrincipal;
import com.restfullapi.jwt.services.myCustomUserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
@PropertySource(value = { "classpath:application.yml" })
public class JwtUtil {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);

    // @Value("${jwt.secret}")
    private String secret = "secret";

    // @Value("${jwt.expiration}")
    private long expirationMs = 60 * 60 * 1000;

    private Jws<Claims> getClaimsFromToken(String token) {

        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token);
        } catch (Exception e) {
            return null;
        }
    }

    public String generateToken(Authentication authentication) {
        myCustomUserDetails userDetails = (myCustomUserDetails) ((Authentication) authentication).getPrincipal();

        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + expirationMs))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();

    }

    public String getUsernameFormJwtToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid JWT signature :{}", authToken, e.getMessage());
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT Token :{}", authToken, e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token is expired: {}", authToken, e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported :{}", authToken, e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty :{}", authToken, e.getMessage());
        }
        return false;
    }

}
