package com.codingshuttle.project.uber.UberApp.services.impl;

import com.codingshuttle.project.uber.UberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.UberApp.entities.Driver;
import com.codingshuttle.project.uber.UberApp.entities.Ride;
import com.codingshuttle.project.uber.UberApp.entities.enums.RideStatus;
import com.codingshuttle.project.uber.UberApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {

    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
