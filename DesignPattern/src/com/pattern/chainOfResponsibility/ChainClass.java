package com.pattern.chainOfResponsibility;

interface ChainClass {
	public void setNextInChain(ChainClass c);
	//public void process();
	void process(NumberClass number);
}
