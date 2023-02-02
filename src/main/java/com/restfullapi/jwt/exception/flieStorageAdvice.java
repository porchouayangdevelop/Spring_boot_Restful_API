package com.restfullapi.jwt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import com.restfullapi.jwt.models.uploads.responseMsg;

@ControllerAdvice
public class flieStorageAdvice {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<responseMsg> handleMaxSizeException(MaxUploadSizeExceededException exc) {
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new responseMsg("File too large!"));
    }
}
