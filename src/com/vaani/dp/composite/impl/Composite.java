package com.vaani.dp.composite.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.vaani.dp.composite.core.Component;

public class Composite implements Component{
	private String name;
	private String description;

	// list of State Components
	List<Component> components = new ArrayList<Component>();

	public Composite(String name, String description){
		this.name = name;
		this.description = description;
	}

	public void add(Component state){
		components.add(state);
	}

	public void remove(Component state){
		components.remove(state);
	}

	public Component getChild(int i){
		return components.get(i);
	}
	public void print(){
		System.out.println("-------------");
		System.out.println("Name ="+getName());
		System.out.println("Description ="+getDescription());
		System.out.println("-------------");
		Iterator<Component> iterator = components.iterator();
		while(iterator.hasNext()){
			Component component = iterator.next();
			component.print();
		}
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}