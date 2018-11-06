package interThreadCommunication;

public class MainThreadBySleep {

	public static void main(String[] args) throws InterruptedException {

		ChildThread t = new ChildThread();
		t.start();
		Thread.sleep(1000);
		System.out.println("End of main method::" + t.total);
	}

}
