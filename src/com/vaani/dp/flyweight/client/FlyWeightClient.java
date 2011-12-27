package com.vaani.dp.flyweight.client;

import java.util.StringTokenizer;
import java.util.Vector;
import com.vaani.dp.flyweight.*;
public class FlyWeightClient {
	  public static void main(String[] args)
	         throws Exception {
	    Vector<String> empList = store();
	    FlyWeightFactory factory =
	    		FlyWeightFactory.getInstance();
	    for (int i = 0; i < empList.size(); i++) {
	    	String name = empList.get(i);
	      StringTokenizer st = new StringTokenizer(name);
	      String division = st.nextToken();
	      IFlyWeight flyweight =
	      factory.getFlyweight(division);
	      // associate the flyweight
	      // with the extrinsic data object.
	      VCard card = new VCard(name, flyweight);
	      card.print();
	    }
	  }
	  private static Vector<String> store() {
	    Vector<String> v = new Vector<String>();
	    v.add("North");
	    v.add("South");
	    v.add("North");
	    return v;
	  }
	}
