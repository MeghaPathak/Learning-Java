package abstractClass;

public class MainClass extends firstAbstract {

	@Override
	public void first() {
		System.out.println("I am in extended");

	}

	public static void main(String args[]) {
		//create refrences and assign
		firstAbstract abstractObject;
		MainClass obj = new MainClass();
		abstractObject = obj;
		abstractObject.first();
	}
}
