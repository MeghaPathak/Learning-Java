package com.pattern.observer;

public interface SubjectMaginePublisher {
	public void registerObserver(ObserverMagazineSubscribers o);

	public void unregisterObserver(ObserverMagazineSubscribers o);

	public void notifyObservers();
}

