package com.vaani.dp.bridge.tyres;

import com.vaani.dp.bridge.core.Tyre;

public class ThickTyre implements Tyre{
    private int width;
    private float cost;
    public ThickTyre(){
        width=200;
        cost = 140;
    }
    public void roll(){
        System.out.println("Rolling on thick tyres of width:"
                             +  width);
    }
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
}