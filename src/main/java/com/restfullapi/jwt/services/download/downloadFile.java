package com.restfullapi.jwt.services.download;

import java.util.List;
import java.util.Optional;

import com.restfullapi.jwt.models.pic.myPicture;

public interface downloadFile {

    List<myPicture> findAlls();

    Optional<myPicture> findById(String id);

}
