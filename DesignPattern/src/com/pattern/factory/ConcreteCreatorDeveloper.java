package com.pattern.factory;

public class ConcreteCreatorDeveloper extends Creator {

	@Override
	protected Employee factoryMethod() {
		// TODO Auto-generated method stub
		return new Developer();
	}

}
