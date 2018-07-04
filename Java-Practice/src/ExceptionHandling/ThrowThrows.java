package ExceptionHandling;

public class ThrowThrows {
	public static void main(String args[]) {
		try {
			m2();
		} 
		finally {
			System.out.println("finally of main");
		}
		//m2();
	}

	public static void m1() {
		try {
			m2();
		} finally {
			System.out.println("in m1 finally");
		}
	}

	public static void m2(){
		if (true) {
			throw new ArithmeticException();
		}
	}

}
