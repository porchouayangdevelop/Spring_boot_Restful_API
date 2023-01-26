package com.restfullapi.jwt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.restfullapi.jwt.exception.ResourceNotFoundException;
import com.restfullapi.jwt.models.User;
import com.restfullapi.jwt.repositories.userRepository;

@Service
public class userService {

    @Autowired
    userRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public ResponseEntity<User> findByEntity(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        return ResponseEntity.ok().body(user);
    }

    public ResponseEntity<User> createUser(User user) {
        String hashedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setUsername(user.getUsername());
        user.setPassword(hashedPassword);
        user.setRoleSet(user.getRoleSet());
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);

    }

    public ResponseEntity<User> updateUser(User userData, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        user.setId(userId);
        return ResponseEntity.ok().body(userRepository.save(user));
    }

    public ResponseEntity<String> deleteUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        userRepository.deleteById(user.getId());
        return ResponseEntity.ok().body("User Deleted" + userId + "is deleted");
    }

}
