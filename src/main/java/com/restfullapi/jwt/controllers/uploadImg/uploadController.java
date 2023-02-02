package com.restfullapi.jwt.controllers.uploadImg;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restfullapi.jwt.models.uploads.responseFile;
import com.restfullapi.jwt.models.uploads.responseMsg;

import com.restfullapi.jwt.services.storage.fileStorage;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/upload")
public class uploadController {

    @Autowired
    private fileStorage storage;

    @PostMapping("/img")
    ResponseEntity<responseMsg> uploadImg(
            @RequestParam("id") String id,
            @RequestParam("BANK_CODE") String BANK_CODE,
            @RequestParam("CIF") String CIF,
            @RequestParam("STATUS") String STATUS,
            @RequestParam("REG_BRN") String REG_BRN,
            @RequestParam("REG_DATE") String REG_DATE,
            @RequestParam("REG_TELR") String REG_TELR,
            @RequestParam("file") MultipartFile file) {
        String msg = "";
        try {
            storage.store(id, BANK_CODE, CIF, STATUS, REG_BRN, REG_DATE, REG_TELR, file);
            msg = "Upload file successfully " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new responseMsg(msg));
        } catch (Exception e) {
            msg = "Could not upload the file: " + file.getOriginalFilename() + "!" + e.getMessage();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new responseMsg(msg));
        }

    }

    @GetMapping("/files")
    public ResponseEntity<List<responseFile>> getListFiles() {
        List<responseFile> files = storage.getAllfiles().map(dbFile -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/upload/files/")
                    .path(dbFile.getId())
                    .toUriString();

            return new responseFile(
                    dbFile.getIMG_NAME(),
                    fileDownloadUri,
                    dbFile.getIMG_TYPE(),
                    dbFile.getIMG_CONTENT().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{id}")
    public ResponseEntity<Object> getFile(@PathVariable String id) {
        com.restfullapi.jwt.models.uploads.uploadImg fileDB = storage.getFile(id);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getIMG_NAME() + "\"")
                .body(fileDB.getIMG_CONTENT());
    }

}
