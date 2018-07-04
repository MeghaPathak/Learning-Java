package Constructor;

public class TubeLight extends Light {
	//instance variable

	//public int pub = 4;
	public int pri = 6;
	public int pro = 6;
	
	//final variable
	final static public int finalStaticPub=1;
	
	//constructor
	public TubeLight() {
		System.out.println("Def Constructor");
	}
	
	
	public TubeLight(int pub, int pro, int pri) {
	super(pub); //<--- Calls Light ka constructor 1
		//this.pub = pub;
		this.pro = pro;
		this.pri = pri;
		System.out.println("Tubelight : Para Constructor 2");
	}	
	
}
