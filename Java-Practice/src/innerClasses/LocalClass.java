package innerClasses;

public class LocalClass {
	int a = 2;

	void method() {
		class InnerLocal {
			void msg() {
				System.out.println("Yo" + a);
			}
		}
		InnerLocal inner = new InnerLocal();
		inner.msg();
	}

	public static void main(String a[]) {
		LocalClass o = new LocalClass();
		o.method();
	}
}
