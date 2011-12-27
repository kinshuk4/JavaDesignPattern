package com.vaani.dp.decorator.demo;

import com.vaani.dp.decorator.base.Breakfast;
import com.vaani.dp.decorator.concrete.*;
import com.vaani.dp.decorator.decorate.concrete.*;

public class BreakfastMenu {

	public static void main(String[] args) {

		// without adding decorators
		Breakfast menu1 = new Dosa();
		System.out.println(menu1.getDescription() +" Rs. "+menu1.cost());


		//adding decorators
		Breakfast menu2 = new MasalaDosaDecorator(new OnionDosaDecorator(new Dosa()));
		System.out.println(menu2.getDescription() +" Rs. "+menu2.cost());  

		Breakfast menu3 = new MasalaDosaDecorator(new Dosa());
		System.out.println(menu3.getDescription() +" Rs. "+menu3.cost());
	}
}