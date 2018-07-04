package Constructor;

public class Light {
	// instance variable
	public int pub = 2;
	protected int pro;
	private int pri;
	int def;

	// static variable
	public static int staticPub;
	protected static int staticPro;
	private static int staticPri;

	// final variable
	final static public int finalStaticPub = 0;

	// constructor calls
	public Light() {
		System.out.println("Default Constructor");
	}

	public Light(int pub) {
		this.pub = pub;
		System.out.println("Light : Para Constructor 1" + this.pub);
		System.out.println(this instanceof Light);
		System.out.println(this instanceof TubeLight);
	}
	
	public Light(int pub, int pro, int pri) {
		this(pub);
		this.pro = pro;
		this.pri = pri;
		System.out.println("Light : Para Constructor 2");
	}

}