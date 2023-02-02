package com.restfullapi.jwt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.uploads.uploadImg;

@Repository
public interface uploadRepository extends JpaRepository<uploadImg, String> {

}
