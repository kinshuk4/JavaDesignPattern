package com.vaani.dp.decorator.decorate.concrete;

import com.vaani.dp.decorator.base.Breakfast;
import com.vaani.dp.decorator.decorate.Decorator;

public class MasalaDosaDecorator extends Decorator{

	Breakfast breakfast;

	public MasalaDosaDecorator(Breakfast breakfast){
		this.breakfast = breakfast;
	}

	public String getDescription(){
		return breakfast.getDescription()+" ,its MasalaDosa";
	}

	public double cost(){
		return breakfast.cost() + 5.50;
	}
}
