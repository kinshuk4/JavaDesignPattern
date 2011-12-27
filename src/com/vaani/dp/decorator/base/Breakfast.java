package com.vaani.dp.decorator.base;

public abstract class Breakfast {

	protected String description = "Unknown Breakfast";

	public String getDescription() {
		return description;
	}
	public abstract double cost();
}