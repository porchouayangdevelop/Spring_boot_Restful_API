package com.restfullapi.jwt.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfullapi.jwt.dto.JwtResponse;
import com.restfullapi.jwt.dto.loginRequest;
import com.restfullapi.jwt.jwt.JwtUtil;
import com.restfullapi.jwt.services.myCustomUserDetails;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class authController {

        @Autowired
        AuthenticationManager authenticationManager;

        @Autowired
        JwtUtil jwtUtil;

        private myCustomUserDetails myCustomUserDetails;

        @PostMapping("/token")
        public ResponseEntity<?> authenticationUser(@RequestBody loginRequest data) {
                Authentication authentication = authenticationManager.authenticate(
                                new UsernamePasswordAuthenticationToken(data.getUsername(), data.getPassword()));

                SecurityContextHolder.getContext().setAuthentication(authentication);
                String jwt = jwtUtil.generateJwtToken(authentication);
                myCustomUserDetails = authentication.getPrincipal() instanceof myCustomUserDetails
                                ? (myCustomUserDetails) authentication.getPrincipal()
                                : null;

                List<String> roles = myCustomUserDetails.getAuthorities()
                                .stream().map(item -> item.getAuthority())
                                .collect(Collectors.toList());

                return ResponseEntity.ok(new JwtResponse(jwt, myCustomUserDetails.getUsername(), roles));

        }

}
