package com.codingshuttle.project.uber.UberApp.services;

import com.codingshuttle.project.uber.UberApp.dto.DriverDto;
import com.codingshuttle.project.uber.UberApp.dto.RideDto;
import com.codingshuttle.project.uber.UberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
