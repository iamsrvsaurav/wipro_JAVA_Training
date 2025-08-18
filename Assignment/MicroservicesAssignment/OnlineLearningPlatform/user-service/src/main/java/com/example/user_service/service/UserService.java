package com.example.user_service.service;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository repo, PasswordEncoder encoder) {
        this.userRepository = repo;
        this.passwordEncoder = encoder;
    }

    // Register method encodes password before saving
    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    // Automatic migration on application startup to encode plain passwords already in DB
    @PostConstruct
    public void migratePasswordsToBCrypt() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            String pwd = user.getPassword();
            if (pwd != null && !pwd.startsWith("$2a$")) { // BCrypt hashes start with $2a$, $2b$, or $2y$
                user.setPassword(passwordEncoder.encode(pwd));
                userRepository.save(user);
                System.out.println("Migrated password to BCrypt for user: " + user.getUsername());
            }
        }
    }
}
