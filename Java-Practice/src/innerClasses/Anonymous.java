package innerClasses;

public class Anonymous {
	int b;

	public void yo() {
		Age a = new Age() {
			@Override
			public int getAge() {
				return b;
			}
		};
	}

}

interface Age {
	int getAge();
}