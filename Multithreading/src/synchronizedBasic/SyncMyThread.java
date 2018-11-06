package synchronizedBasic;

public class SyncMyThread extends Thread{
	SyncDisplay d;
	String name;
	public SyncMyThread() {}
	
	SyncMyThread(SyncDisplay d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
}
