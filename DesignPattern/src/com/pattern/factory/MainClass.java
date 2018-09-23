package com.pattern.factory;

public class MainClass {
	public static void main(String a[]){
		Creator c1 = new ConcreteCreaterManager();
		System.out.println(c1.someOperation());
	}
}
