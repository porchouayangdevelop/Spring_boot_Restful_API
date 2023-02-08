package com.restfullapi.jwt.services.download;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.pic.myPicture;

@Repository
public class donwnloadImpl implements downloadFile {

    @Autowired
    private JdbcTemplate service;

    String sql;

    @Override
    public List<myPicture> findAlls() {
        sql = "SELECT * FROM user_pic";

        return service.query(sql, new downloadMapper());
    }

    @Override
    public Optional<myPicture> findById(String id) {

        return Optional.empty();
    }

}
