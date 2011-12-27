package com.vaani.dp.bridge.vehicles;

import com.vaani.dp.bridge.core.Engine;
import com.vaani.dp.bridge.core.Tyre;
import com.vaani.dp.bridge.core.Vehicle;

public class BigTruck extends Vehicle {

    public BigTruck(Engine engine,Tyre tyre) {
        this.assemblingCost = 3000;
        assembleVehicle(engine,tyre);//calls assembleEngine
                                  // from base class
    }

    @Override
    public void drive() {
        System.out.println("Driving the truck now, with cost:"
        		+getPrice());
    } 

}
