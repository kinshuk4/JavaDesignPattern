package com.vaani.dp.bridge.vehicles;

import com.vaani.dp.bridge.core.*;

public class SmallCar extends Vehicle {

	public SmallCar(Engine engine,Tyre tyre) {
		this.assemblingCost = 2000;
		assembleVehicle(engine,tyre);//calls assembleEngine
		// from base class
	}

	@Override
	public void drive() {
		System.out.println("Driving the car now, with cost:"+
				getPrice());

		engine.kickStart();

		tyre.roll();
	}

}