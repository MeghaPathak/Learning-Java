package yieldMethod;

public class YieldDemo {

	public static void main(String[] args) {
		YieldThread t = new YieldThread();
		t.start();
		for (int i = 0; i < 5; i++) {
			// Control passes to child thread
			Thread.yield();

			// After execution of child Thread
			// main thread takes over
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}

}

/*
Output:
	hread-0 in control
	Thread-0 in control
	Thread-0 in control
	Thread-0 in control
	Thread-0 in control
	main in control
	main in control
	main in control
	main in control
	main in control
*/