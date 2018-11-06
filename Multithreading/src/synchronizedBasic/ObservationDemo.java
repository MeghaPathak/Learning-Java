package synchronizedBasic;

import java.lang.reflect.Method;

public class ObservationDemo {
	public static void main(String arg[]) {

/*		Interesting observation:
			Now I pass two different display object. Both calling sync Method. 
			Output will be regular or irregular?
*/					
		SyncDisplay d1 = new SyncDisplay();
		SyncDisplay d2 = new SyncDisplay();
		SyncMyThread t1 = new SyncMyThread(d1, "Megha");
		SyncMyThread t2 = new SyncMyThread(d2, "Aman");
		t1.start();
		t2.start();
	}
	
}
/*
Output will be irregular because..
there are two objects : d1 ---> has thread t1 executing by acquiring a lock on d1
						d2 ---> has thread t2 executing by acquiring a lock on d2
These threads are working on independent object. They are non conflicting. 
So actually the output will be irregular irrespective method is sync or non sync.
*/
