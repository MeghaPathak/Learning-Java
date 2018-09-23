package com.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteMagazinePublisher implements SubjectMaginePublisher{
	ArrayList<ObserverMagazineSubscribers> list;
	
	public ConcreteMagazinePublisher(){
		list = new ArrayList<ObserverMagazineSubscribers>();
	}

	@Override
	public void registerObserver(ObserverMagazineSubscribers o) {
		list.add(o);
		
	}

	@Override
	public void unregisterObserver(ObserverMagazineSubscribers o) {
		list.remove(list.indexOf(o));
		
	}

	@Override
	public void notifyObservers() {
		for (Iterator<ObserverMagazineSubscribers> it =
	              list.iterator(); it.hasNext();)
	        {
			ObserverMagazineSubscribers o = it.next();
	            o.update();
	    }
	 
		
	}
	
	
}
