package com.codingshuttle.project.uber.UberApp.dto;

import com.codingshuttle.project.uber.UberApp.entities.Rider;
import com.codingshuttle.project.uber.UberApp.entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.UberApp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickUpLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private RiderDto rider;
    private DriverDto driver;
    private Double fare;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
}
