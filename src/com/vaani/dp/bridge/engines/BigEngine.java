package com.vaani.dp.bridge.engines;

import com.vaani.dp.bridge.core.Engine;

public class BigEngine implements Engine {

    int horsepower;
    float cost;
    public BigEngine() {
        horsepower = 350;
        cost = 200;
    }

    @Override
    public int kickStart() {
        System.out.println("The big engine is running");
        return horsepower;
    }

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}