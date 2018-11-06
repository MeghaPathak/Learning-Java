package nonsynchronizedBasic;

public class NonSyncMyThread extends Thread {
	NonSyncDisplay d;
	String name;
	public NonSyncMyThread() {}
	
	NonSyncMyThread(NonSyncDisplay d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
}
