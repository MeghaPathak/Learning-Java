package com.pattern.chainOfResponsibility;

public class NegativeNumberChainClass implements ChainClass {

	private ChainClass next;
	@Override
	public void setNextInChain(ChainClass c) {
		this.next = c;
	}

	@Override
	public void process(NumberClass number) {
		//Either you process...else let's see if Positive can process
		if(number.getNumber() < 0)
			System.out.println("NegativeProcessor : ");
		else
			next.process(number);
	}

}
