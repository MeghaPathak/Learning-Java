package sleepMethod;

public class sleepDemo {

	public static void main(String[] args) {
		myThread t1 = new myThread();
		myThread t2 = new myThread();
		t1.setName("T1");
		t1.setName("T2");

		t1.start();
		t2.start();

	}

	/*
	 * 
	 * output1 : Thread-10 T20 Thread-11 T21 Thread-12 T22 Thread-13 T23
	 * Thread-14 T24
	 */

}
