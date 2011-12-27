package com.vaani.dp.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
	private HashMap<String, IFlyWeight> lstFlyweight;
	private static FlyWeightFactory factory = new
			FlyWeightFactory();
	private FlyWeightFactory() {
		lstFlyweight = new HashMap<String, IFlyWeight>();
	}
	public synchronized IFlyWeight getFlyweight(String divisionName) {
		if (lstFlyweight.get(divisionName) == null) {
			IFlyWeight fw = new FlyWeight(divisionName);
			lstFlyweight.put(divisionName, fw);
			return fw;
		} else {
			return
					(IFlyWeight)lstFlyweight.get(divisionName);
		}
	}
	public static FlyWeightFactory getInstance() {
		return factory;
	}

	//Inner flyweight class
	private class FlyWeight 
	implements IFlyWeight {
		private String name;
		private String addr;
		private void setValues(String name, String addr) {
			this.name = name;
			this.addr = addr;
		}
		private FlyWeight(String division) {
			if (division.equals("North")) {
				setValues("soniya", "addr1");
			}
			if (division.equals("South")) {
				setValues("rahul", "addr2");
			}
			if (division.equals("East")) {
				setValues("Aqil", "addr3");
			}
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return addr;
		}
	}// end of Flyweight
}// end of FlyweightFactory


