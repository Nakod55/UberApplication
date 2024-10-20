package com.codingshuttle.project.uber.UberApp.services;

import com.codingshuttle.project.uber.UberApp.dto.DriverDto;
import com.codingshuttle.project.uber.UberApp.dto.RideDto;
import com.codingshuttle.project.uber.UberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.UberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RiderDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();


}
