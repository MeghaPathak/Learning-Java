package Implementation;

public class ThreadDemo {

	public static void main(String[] args) {

		ImplementationByThreadClass t1 = new ImplementationByThreadClass();
		t1.start();   //<-- Automatically calls the run method.
		
		ImplementationByRunnable r = new ImplementationByRunnable();
		Thread t2 = new Thread(r);
		t2.start(); 
	}
}


/*
 * What if we call run() method directly instead start() method?

Each thread starts in a separate call stack.
Invoking the run() method from main thread, the run() method goes 
onto the current call stack rather than at the beginning of a new call stack.
 * */
