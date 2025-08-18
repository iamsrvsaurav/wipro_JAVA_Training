package com.example.user_service.repository;

//package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_service.entity.User;

//import com.example.user.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
