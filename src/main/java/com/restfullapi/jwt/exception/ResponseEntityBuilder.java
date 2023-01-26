package com.restfullapi.jwt.exception;

import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {
    public static ResponseEntity<Object> build(apiError error) {
        return new ResponseEntity<>(error, error.getStatus());

    }
}
