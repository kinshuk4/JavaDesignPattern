package com.vaani.dp.composite.demo;

import com.vaani.dp.composite.core.Component;
import com.vaani.dp.composite.impl.*;

public class Test {
	public static void main(String[] args) {
		Component leaf = new Leaf("leaf","No components futher");
		Component composite = new Composite("composite","Again has components");
		Component subcomposite = new Composite("subcomposite","Sub Composite again contain components");

		Component baseComponent = new Composite("BaseComponent","Includes all other components");

		baseComponent.add(leaf);
		baseComponent.add(composite);
		baseComponent.add(subcomposite);

		baseComponent.print();
	}
}
