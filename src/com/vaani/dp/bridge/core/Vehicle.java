package com.vaani.dp.bridge.core;

public abstract class Vehicle {
	//Vehicle have components like engine, tyre 
	//add other components like headlight, music system etc..
	//but I just took 2 for simplicity
	    protected Engine engine;
	    protected Tyre tyre;

	    //assembling cose is fixed here, but can be variable
	    protected float assemblingCost;

	    public abstract void drive();

	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }
	    
	    public void setTyres(Tyre tyre)
	    {
	        this.tyre = tyre;   
	    }
	    
	    public void assembleVehicle(Engine engine,Tyre tyre)
	    {
	        this.engine=engine;    
	        this.tyre = tyre;
	    }
	    public float getPrice()
	    {  
	        return tyre.getCost()+engine.getCost()+assemblingCost;  
	    }
	}