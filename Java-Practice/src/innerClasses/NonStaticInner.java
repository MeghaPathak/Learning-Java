package innerClasses;

public class NonStaticInner {
	public int pub;
	private int pri;
	protected int pro;
	
	static int staticPub;
	
	final static int finalStaticPub=0;
	
	public static void main(String[] args) {}
	
	public void instanceOuterMethod(){
	}
	
	public static void staticMethod(){}
	
	
	public class Inner{
		public int innerPub;
		private int innerPri;
		
		public int accessOuterClass(){
			return staticPub;   
			/*<--- I can refer to static variable here. 
			But referring non static variable pub gives an error */
		}
		
		public void accesByPassingOuterClassObject(NonStaticInner obj){
			System.out.println(obj.pri); //<-- private bhi access kar liya.
			obj.instanceOuterMethod();  //<-- instance method bhi access kar liya.
			StaticInner.staticMethod();  //<-- static h toh class name se bhi access kar liya.	
		}		
	}	
	public void accessInnerClass(){
		NonStaticInner obj = new NonStaticInner();
		//System.out.println(obj.); <-- does not give access to any of the members inside inner class
		NonStaticInner.Inner obj2 = obj.new Inner(); //<-- weird syntax
		System.out.println(obj2.innerPri); 
	}

}
