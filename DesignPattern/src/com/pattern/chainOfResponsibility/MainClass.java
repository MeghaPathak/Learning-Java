package com.pattern.chainOfResponsibility;

public class MainClass {
	public static void main(String a[]) {

		ChainClass c1 = new NegativeNumberChainClass();
		ChainClass c2 = new PositiveChainClass();
		ChainClass c3 = new ZeroChainClass();
		
		c1.setNextInChain(c2);
		c2.setNextInChain(c3);
		
		c1.process(new NumberClass(-1));
		c1.process(new NumberClass(1));
		c1.process(new NumberClass(0));
		
		
		
	}
}


/*
 * Chain of responsibility pattern is used to achieve loose coupling in software
 *  design where a request from client is passed to a chain of objects to 
 *  process them. Later, the object in the chain will decide themselves 
 *  who will be processing the request and whether the request 
 *  is required to be sent to the next object in the chain or not.
 * */
