package nonsynchronizedBasic;

public class NonSyncDisplay {
	//A non synchronized method
	public void wish(String name){
		for (int i = 0; i<5; i++){
			System.out.println("Hello :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(name);
		}
	}
}

