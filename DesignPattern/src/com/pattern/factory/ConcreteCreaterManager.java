package com.pattern.factory;

public class ConcreteCreaterManager extends Creator {

	@Override
	protected Employee factoryMethod() {
		// TODO Auto-generated method stub
		return new Manager();
	}

}
