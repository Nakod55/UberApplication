package com.codingshuttle.project.uber.UberApp.services;

import com.codingshuttle.project.uber.UberApp.dto.DriverDto;
import com.codingshuttle.project.uber.UberApp.dto.SignupDto;
import com.codingshuttle.project.uber.UberApp.dto.UserDto;

public interface AuthService {

    String login(String mail, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);

}
