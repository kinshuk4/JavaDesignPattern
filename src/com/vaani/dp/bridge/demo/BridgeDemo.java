package com.vaani.dp.bridge.demo;

import com.vaani.dp.bridge.core.*;
import com.vaani.dp.bridge.engines.*;
import com.vaani.dp.bridge.tyres.*;
import com.vaani.dp.bridge.vehicles.*;

public class BridgeDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new BigTruck(new SmallEngine(),new ThickTyre());
        vehicle.drive();
        vehicle.assembleVehicle(new BigEngine(),new ThickTyre());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine(),new MediumTyre());
        vehicle.drive();
        vehicle.assembleVehicle(new BigEngine(),new MediumTyre());
        vehicle.drive();

    }

}
