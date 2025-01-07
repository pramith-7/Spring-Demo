package com.example.demo.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {

    public List<user> getusers() {
        return List.of(
                new user(
                        1L,
                        "Kasun Bandara",
                        25,
                        "kasunbandara@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,14)
                )
        );
    }

}
