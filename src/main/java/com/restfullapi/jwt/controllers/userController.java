package com.restfullapi.jwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.restfullapi.jwt.models.User;
import com.restfullapi.jwt.services.userService;

@RestController
@RequestMapping(path = "/users")
@Validated
public class userController {

    @Autowired
    userService userService;

    @GetMapping("/all")
    // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<User>> findAllUsers() {

        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping("/{id}")
    // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<User> findUserById(@PathVariable("id") Long user_id) {

        return ResponseEntity.ok(userService.findByEntity(user_id)).getBody();

    }

    @PostMapping("/register")
    // @PreAuthorize("Authoriztion('ADMIN')")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userService.createUser(user);
        return new ResponseEntity<>("user register successfully", HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("id") Long user_id) {

        userService.updateUser(user, user_id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long user_id) {
        userService.deleteUser(user_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
