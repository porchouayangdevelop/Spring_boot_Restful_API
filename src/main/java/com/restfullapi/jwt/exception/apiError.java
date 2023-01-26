package com.restfullapi.jwt.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class apiError {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;
    private List errors;

   

}
