package String;

public class StringMain {
	public static void main(String a[]){
	 String s1 = "Hello";
	 String s2 = "Hello";
	 String s3 = new String("Hello");
	 System.out.println(s1 == s2);
	 char c[] = {'a','b','c','d'};
	 String s5 = new String(c,1,3);
	 System.out.println(	 s1+"world");
	 s2 = s1+"world";
	 System.out.println(s1 == s2);

	 
 }
}
