package com.vaani.dp.decorator.decorate.concrete;

import com.vaani.dp.decorator.base.Breakfast;
import com.vaani.dp.decorator.decorate.Decorator;

public class OnionDosaDecorator extends Decorator{

	Breakfast breakfast;

	public OnionDosaDecorator(Breakfast breakfast){
		this.breakfast = breakfast;
	}

	public String getDescription(){
		return breakfast.getDescription()+" , its OnionDosa";
	}

	public double cost(){
		return breakfast.cost() + 3.50;
	}
}
