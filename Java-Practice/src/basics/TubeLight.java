package basics;

public class TubeLight extends Light {
	//instance variable

	public int pub=4;
	private int pri = 6;
	
	//final variable
	final static public int finalStaticPub=1;
	
	//constructor
	public TubeLight() {
	}
	public TubeLight(int pub){
		this.pub = pub;
	}
	
	//instance method
		public int methodPub(){
			System.out.println("TubeLight:Method:methodPub");
			return 0;
		}
		private int methodPri(){
			System.out.println("TubeLight:Method:methodPri");
			return 0;
		}
		
	//static methods
		public static int methodStaticPub(){
			System.out.println("TubeLight:Method:methodStaticPub");
			return 0;
		}
		private int methodStaticPri(){
			System.out.println("TubeLight:Method:methodStaticPri");
			return 0;
		}
		//Covariant return example
		public TubeLight getInstance(){
			return new TubeLight();
		}

		
	
}
