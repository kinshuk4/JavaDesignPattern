package com.vaani.dp.bridge.engines;

import com.vaani.dp.bridge.core.Engine;

public class SmallEngine implements Engine {

    int horsepower;
    float cost;
    public SmallEngine() {
        horsepower = 100;
        cost = 120;
    }

    @Override
    public int kickStart() {
        System.out.println("The small engine is running");
        return horsepower;
    }

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
