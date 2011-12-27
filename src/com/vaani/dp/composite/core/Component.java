package com.vaani.dp.composite.core;

public interface Component { 
	public void add(Component countryComponent);
	public void remove(Component countryComponent);
	public Component getChild(int i);
	public String getName();
	public String getDescription();
	public void print();
}