package interThreadCommunication;

public class ChildThread extends Thread {
	int total = 0;

// I want to do sum calcutlation here
//	public void run() {
//		for (int i = 0; i < 10000; i++) 
//			total += i;
//		System.out.println("From Child::" + total);
//	}

	//Synchronized
	public void run() {
		synchronized (this) {
			System.out.println("Child::Operation begin" + total);
			for (int i = 0; i < 10000; i++) 
				total += i;
			System.out.println("Child::Operation end" + total);
			this.notify();
		}
		
	}

}