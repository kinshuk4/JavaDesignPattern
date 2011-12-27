package com.vaani.dp.decorator.concrete;

import com.vaani.dp.decorator.base.Breakfast;

public class Dosa extends Breakfast{

	public Dosa() {
		description = "Dosa";
	}

	public double cost(){
		return 12.50;
	}
}