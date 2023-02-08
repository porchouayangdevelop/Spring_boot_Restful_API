package com.restfullapi.jwt.controllers.download;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfullapi.jwt.services.download.downloadFile;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/download")
public class downloadController {

    @Autowired
    private downloadFile downloadService;

    @PostMapping("/files")
    public ResponseEntity<String> downloadFile() {

        downloadService.findAlls();

        return ResponseEntity.status(HttpStatus.OK).body("download file is successfully");

    }

}
