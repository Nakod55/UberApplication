package com.codingshuttle.project.uber.UberApp.strategies;

import com.codingshuttle.project.uber.UberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy    {

    double calculateFare(RideRequestDto rideRequestDto);


}
