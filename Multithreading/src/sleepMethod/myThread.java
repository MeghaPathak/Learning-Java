package sleepMethod;

public class myThread extends Thread {
 public void run(){
	 for(int i=0;i<5;i++){
		 try{
			 Thread.sleep(500);
			 System.out.println(this.getName()+ i);
		 }
		 catch(InterruptedException e){
			 System.out.println(e.getMessage());
		 }
	 }
 }
}
