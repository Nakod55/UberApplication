package com.codingshuttle.project.uber.UberApp.services.impl;

import com.codingshuttle.project.uber.UberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {

    @Override
    public double calculateDistance(Point src, Point des) {
        return 0;
    }

}
