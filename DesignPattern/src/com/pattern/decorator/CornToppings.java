package com.pattern.decorator;

public class CornToppings extends Toppings {
	@Override
	public String getDescription() {
		return "CornToppings";
	}

	@Override
	int getCost() {
		return 10;
	}
}
