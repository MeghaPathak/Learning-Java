package interThreadCommunication;

public class MainThreadByJoin{

	public static void main(String[] args) throws InterruptedException {

		ChildThread t = new ChildThread();
		t.start();
		t.join();
		System.out.println("End of main method" + t.total);
	}

}
