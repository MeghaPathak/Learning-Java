package com.pattern.chainOfResponsibility;

public class PositiveChainClass implements ChainClass {

	private ChainClass next;
	@Override
	public void setNextInChain(ChainClass c) {
		next = c;
	}

	@Override
	public void process(NumberClass number) {
		//Either you process...else let's see if Zero can process
		if(number.getNumber()> 0)
			System.out.println("PositiveProcessor : ");
		else
			next.process(number);
	}

}
