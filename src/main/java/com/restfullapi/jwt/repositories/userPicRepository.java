package com.restfullapi.jwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.pic.myPicture;

@Repository
public interface userPicRepository extends JpaRepository<myPicture, String> {

}
