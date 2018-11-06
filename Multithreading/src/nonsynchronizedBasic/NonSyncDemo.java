package nonsynchronizedBasic;

public class NonSyncDemo {
	public static void main(String arg[]) {
		NonSyncDisplay d = new NonSyncDisplay();
		NonSyncMyThread t1 = new NonSyncMyThread(d, "Megha");
		NonSyncMyThread t2 = new NonSyncMyThread(d, "Aman");
		t1.start();
		t2.start();
	}
}
/*
 * /*
 * This is a  NON sync Example. 
 * The NON Sync Display class has a NON sync method Wish. When t1 calls the method wish on it...
 * Then loop gets executed for t1 and t2 in an interleaved fashion...where the output is diffewrent everytime. */
/*
Output :
		Hello :
		Hello :
		AmanMeghaHello :
		Hello :
		AmanHello :
		MeghaHello :
		AmanHello :
		MeghaHello :
		MeghaHello :
		AmanHello :
		AmanMegha
		
		*/
