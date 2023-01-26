package com.restfullapi.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.User;

@Repository
public interface userRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    Optional<User> findById(Long userId);

}
