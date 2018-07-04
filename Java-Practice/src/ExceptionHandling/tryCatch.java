package ExceptionHandling;

public class tryCatch {
//Dekh rhi thi ki kiska execution kab ho rha
	public static void main(String[] args) {
		tryCatch o = new tryCatch();
		System.out.println("in M1");
		System.out.println("in M2");
		o.f1();
		System.out.println("in M3");

	}

	void f1() {
		System.out.println("in F1");
		f2();
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println("Error aala");
		} finally {
			System.out.println("finally aala");
		}
		System.out.println("in F2");
	}

	void f2() {
		System.out.println("in F3");

	}

}
