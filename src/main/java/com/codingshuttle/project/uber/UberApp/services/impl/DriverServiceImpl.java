package com.codingshuttle.project.uber.UberApp.services.impl;

import com.codingshuttle.project.uber.UberApp.dto.DriverDto;
import com.codingshuttle.project.uber.UberApp.dto.RideDto;
import com.codingshuttle.project.uber.UberApp.dto.RiderDto;
import com.codingshuttle.project.uber.UberApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }

}
