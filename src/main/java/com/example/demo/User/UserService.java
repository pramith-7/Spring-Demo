package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getusers() {
        return userRepository.findAll();
    }

    public void addNewUser(Users user) {
        Optional<Users> usersOptional = userRepository.findUsersByEmail(user.getEmail());
        if (usersOptional.isPresent()) {
            throw new IllegalStateException("Email alread teaken");
        }
        userRepository.save(user);
    }
}
