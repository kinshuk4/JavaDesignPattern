package com.vaani.dp.composite.impl;

import com.vaani.dp.composite.core.Component;

public class Leaf implements Component{
	 private String name;
	 private String description;
	 
	 public Leaf(String name,String description){
	  this.name = name;
	  this.description = description;
	 }
	 
	 /* these three methods doesn't make
	  * sense for Leaf. So we can even make 
	  * the Base Component as abstract Class
	  * and provide the default implementation 
	  * instead of this approach.
	  */
	 
	 public void add(Component state){
	  System.out.println("Sorry, leaf can't have components ");
	 }
	 
	 public void remove(Component state){
	  System.out.println("Sorry, leaf can't have components ");
	 }
	 
	 public Component getChild(int i){
	  System.out.println("Sorry, leaf can't have components ");
	  throw new UnsupportedOperationException();
	 }
	 
	 public void print(){
	  System.out.println("-------------");
	  System.out.println("Name ="+getName());
	  System.out.println("Description ="+getDescription());
	  System.out.println("-------------");
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


