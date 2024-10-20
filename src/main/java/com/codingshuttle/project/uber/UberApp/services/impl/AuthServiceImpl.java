package com.codingshuttle.project.uber.UberApp.services.impl;

import com.codingshuttle.project.uber.UberApp.dto.DriverDto;
import com.codingshuttle.project.uber.UberApp.dto.SignupDto;
import com.codingshuttle.project.uber.UberApp.dto.UserDto;
import com.codingshuttle.project.uber.UberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String mail, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
