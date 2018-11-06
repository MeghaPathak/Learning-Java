package staticSynchronizedBasic;

public class StaticSyncMyThread extends Thread{
	StaticSyncDisplay d;
	String name;
	public StaticSyncMyThread() {}
	
	StaticSyncMyThread(StaticSyncDisplay d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
}
