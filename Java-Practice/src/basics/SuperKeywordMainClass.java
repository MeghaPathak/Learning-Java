package basics;

public class SuperKeywordMainClass extends Light {
	
	public int pub=10;
	protected int pro;
	private int pri;
	
	public void checkSuper(){
		SuperKeywordMainClass yo = new SuperKeywordMainClass();
		Light objLight = new Light();
		System.out.println(pub);   //10
		
		//Access hidden field from super		
		System.out.println(super.pub);   //2
		
		//Access static field from super
		System.out.println(super.staticPro);
		
		//Access instance method from super
		System.out.println(super.methodPro());
		
		//Access static method from super
		System.out.println(super.methodStaticPub());
		
		//Access final static method from super
		System.out.println(super.methodFinalStaticPub());
		
	}
	
	
	public static void main(String[] args) {
	SuperKeywordMainClass yo = new SuperKeywordMainClass();
	yo.checkSuper();
	}

}
