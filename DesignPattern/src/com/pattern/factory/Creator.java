package com.pattern.factory;

public abstract class Creator {
	public String someOperation(){
		Employee e = factoryMethod();
		return e.getRoles();
	}
	
	protected abstract Employee factoryMethod();
}
