package com.pattern.observer;


public class ObserverRichMagazineSubscribers implements ObserverMagazineSubscribers {

	@Override
	public void update() {
	System.out.println("RICH:The Magazine is updated");
		
	}

}