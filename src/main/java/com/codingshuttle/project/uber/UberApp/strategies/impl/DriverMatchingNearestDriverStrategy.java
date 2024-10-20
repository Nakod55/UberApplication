package com.codingshuttle.project.uber.UberApp.strategies.impl;

import com.codingshuttle.project.uber.UberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.UberApp.entities.Driver;
import com.codingshuttle.project.uber.UberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
