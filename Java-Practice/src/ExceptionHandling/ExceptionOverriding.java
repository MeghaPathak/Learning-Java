package ExceptionHandling;

import java.io.IOException;

public class ExceptionOverriding extends A {
	public static void main(String[] args) {
		A a = new ExceptionOverriding();
		try {
			a.f1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void f1() throws IOException {
		System.out.println(0/0);
	}
}
class A {
	public void f1() throws Exception{
		System.out.println("In A::f1()");
	}
	
}