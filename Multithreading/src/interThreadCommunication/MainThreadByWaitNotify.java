package interThreadCommunication;

public class MainThreadByWaitNotify {
	public static void main(String[] args) throws InterruptedException {

		ChildThread t = new ChildThread();
		t.start();
		
		synchronized (t) {
			System.out.println("Main-BEfore wait ::" + t.total);
			t.wait();
			System.out.println("Main-After wait ::" + t.total);
		}
	}
}

/*
Output
Main-BEfore wait ::0
Child::Operation begin0
Child::Operation end49995000
Main-After wait ::49995000
*/