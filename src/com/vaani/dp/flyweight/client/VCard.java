package com.vaani.dp.flyweight.client;

import com.vaani.dp.flyweight.IFlyWeight;

public class VCard {
	String name;
	String title;
	IFlyWeight objFW;
	public VCard(String n, IFlyWeight fw) {
		name = n;
		objFW = fw;
	}
	public void print() {
		System.out.println(name);
		System.out.println(name + objFW.getAddress());
	}
}
