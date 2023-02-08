package com.restfullapi.jwt.services.download;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.pic.myPicture;

@Repository
public class donwnloadImpl<T> implements downloadFile {

    @Autowired
    private JdbcTemplate service;

    @Override
    public List<myPicture> findAlls() {
        return service.query("SELECT * FROM get_Pic", new downloadMapper());
    }

    @Override
    public Optional<myPicture> findById(String id) {

        return Optional.empty();
    }

}
