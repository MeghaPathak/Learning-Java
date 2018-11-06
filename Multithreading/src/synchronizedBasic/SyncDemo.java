package synchronizedBasic;

public class SyncDemo {
	public static void main(String arg[]) {
		SyncDisplay d = new SyncDisplay();
		SyncMyThread t1 = new SyncMyThread(d, "Megha");
		SyncMyThread t2 = new SyncMyThread(d, "Aman");
		t1.start();
		t2.start();
		
	}
}

/*
 * This is a sync Example. The Sync Display class has a sync method Wish. When t1 calls the sync method wish on it. 
 * Then loop gets executed for t1 first then t2 */
/*
Output :
Hello :
MeghaHello :
MeghaHello :
MeghaHello :
MeghaHello :
MeghaHello :
AmanHello :
AmanHello :
AmanHello :
AmanHello :
Aman
*/