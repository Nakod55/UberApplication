package com.codingshuttle.project.uber.UberApp.services.impl;

import com.codingshuttle.project.uber.UberApp.dto.DriverDto;
import com.codingshuttle.project.uber.UberApp.dto.RideDto;
import com.codingshuttle.project.uber.UberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.UberApp.dto.RiderDto;
import com.codingshuttle.project.uber.UberApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RiderDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
