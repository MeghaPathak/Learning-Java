package com.pattern.decorator;

public class MainClass {
	public static void main(String a[]) {
		Pizza p1 = new PaneerPizza();
		System.out.println(p1.getCost());
		
		p1 = new TomatoToppings(p1);
		System.out.println(p1.getCost());  //Here tomato's cost is added
		
	}
}


//Example referred from : https://www.geeksforgeeks.org/decorator-pattern-set-3-coding-the-design/
