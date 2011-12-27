package com.vaani.dp.bridge.tyres;

import com.vaani.dp.bridge.core.Tyre;

public class MediumTyre implements Tyre{
    private int width;
    private float cost;
    public MediumTyre (){
        width=140;
        cost = 80;
    }
    public void roll(){
        System.out.println("Rolling on thin tyres of width:"
                             +  width);
    }
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
}