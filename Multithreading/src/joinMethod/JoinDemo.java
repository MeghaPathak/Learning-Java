package joinMethod;

public class JoinDemo {

	public static void main(String[] args) {
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();

		t1.start();

		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
	}

}
/*
Thread-0 in control
Thread-0 in control
Thread-0 in control
Thread-0 in control
Thread-0 in control
Thread-1 in control
Thread-1 in control
Thread-1 in control
Thread-1 in control
Thread-1 in control

*/