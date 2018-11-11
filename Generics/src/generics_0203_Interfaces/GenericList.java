package generics_0203_Interfaces;

public class GenericList<T> implements GenericInterfaace<T>{
	public T myList;
	@Override
	public void add(T t) {
		myList = t;
	}

}
