package com.restfullapi.jwt.controllers.users;

import java.sql.SQLException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restfullapi.jwt.models.pic.myPicture;
import com.restfullapi.jwt.repositories.userPicRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequestMapping("/user-pictures")
public class userPicController {

    @Autowired
    userPicRepository repository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getPicture(@PathVariable("id") String id) throws SQLException {

        Optional<myPicture> pic = repository.findById(id);
        byte[] image = null;

        if (pic.isPresent()) {
            image = pic.get().getPicture().getBytes(1, (int) pic.get().getPicture().length());
        }

        return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image);
    }

}
