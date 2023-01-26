package com.restfullapi.jwt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class homeController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("home page", HttpStatus.OK);

    }

}
