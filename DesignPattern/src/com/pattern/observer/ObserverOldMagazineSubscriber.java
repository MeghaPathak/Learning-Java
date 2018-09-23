package com.pattern.observer;

public class ObserverOldMagazineSubscriber implements ObserverMagazineSubscribers {

	@Override
	public void update() {
	System.out.println("OLD :The Magazine is updates");
		
	}

}
