package basics;

public class Light {
	//instance variable
	public int pub=2;
	protected int pro;
	private int pri;
	int def;
	
	//static variable
	public static int staticPub;
	protected static int staticPro;
	private static int staticPri;
	
	//final variable
	final static public int finalStaticPub=0;
	
	//constructor calls
	public Light() {}
	
	public Light(int pub){
		this.pub = pub;
	}
	
	//instance method
	public int methodPub(){
		System.out.println("Light:Method:methodPub");
		return 0;
	}
	private int methodPri(){
		System.out.println("Light:Method:methodPri");
		return 0;
	}
	protected int methodPro(){
		System.out.println("Light:Method:methodPro");
		return 0;
	}
	
	//static methods
	public static int methodStaticPub(){
		System.out.println("Light:Method:methodStaticPub");
		return 0;
	}
	private int methodStaticPri(){
		System.out.println("Light:Method:methodStaticPri");
		return 0;
	}
	protected int methodStaticPro(){
		System.out.println("Light:Method:methodStaticPro");
		return 0;
	}
	
	//final method
	public final static int methodFinalStaticPub(){
		System.out.println("Light:Method:methodStaticPub");
		return 0;
	}
	
	//Covariant return example
	public Light getInstance(){
		return new Light();
	}
	
}