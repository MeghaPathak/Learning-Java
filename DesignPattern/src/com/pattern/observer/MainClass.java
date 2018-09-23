package com.pattern.observer;


public class MainClass {
	public static void main(String a[]) {
		
		ObserverMagazineSubscribers old = new ObserverOldMagazineSubscriber();
		ObserverMagazineSubscribers rich = new ObserverRichMagazineSubscribers();
		
		SubjectMaginePublisher subject = new ConcreteMagazinePublisher();
		
		subject.registerObserver(old);
		subject.registerObserver(rich);
		
		subject.notifyObservers();
		
		
	}
}

/*
1.Main class :Implementation Class
2. MagazinePublisher (Subject) publishes magazine (data)
3. MagzineSubscribers (Observer)can be of several types.
4. Each of the subscribers (Observers) are waiting for Magazine to publish (notify)
 so that they can perform an action
*/ 