package com.restfullapi.jwt.services.storage;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.restfullapi.jwt.models.uploads.uploadImg;
import com.restfullapi.jwt.repositories.uploadRepository;

@Service
public class fileStorage {

    @Autowired
    private uploadRepository upload;

    public uploadImg getFile(String id) {
        return upload.findById(id).get();

    }

    public Stream<uploadImg> getAllfiles() {
        return upload.findAll().stream();
    }

    public uploadImg store(String id, String bANK_CODE, String cIF, String sTATUS, String rEG_BRN, String rEG_DATE,
            String rEG_TELR,
            MultipartFile file) throws Exception {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        uploadImg data = new uploadImg();
        data.setId(id);
        data.setBANK_CODE(bANK_CODE);
        data.setCIF(cIF);
        data.setIMG_TYPE(file.getContentType());
        data.setSTATUS(sTATUS);
        data.setIMG_NAME(fileName);
        data.setREG_BRN(rEG_BRN);
        data.setREG_DATE(rEG_DATE);
        data.setREG_TELR(rEG_TELR);
        data.setIMG_CONTENT(file.getBytes());
        return upload.save(data);
    }

}
