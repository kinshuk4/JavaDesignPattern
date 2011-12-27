package com.vaani.dp.decorator.concrete;

import com.vaani.dp.decorator.base.Breakfast;

public class Idli extends Breakfast{

	public Idli() {
		description = "Idli";
	}
	public double cost(){
		return 10.50;
	}
}