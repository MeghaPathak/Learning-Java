package com.pattern.decorator;

public class TomatoToppings extends Toppings {
	Pizza p;
	
	public TomatoToppings(Pizza p) {
		this.p = p;
	}
	@Override
	public String getDescription() {
		return "TomatoToppings";
	}

	@Override
	int getCost() {
		return 20 + this.p.getCost();
	}

}
