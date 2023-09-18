package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    User create(User user);
    User getCurrentUser();
}
