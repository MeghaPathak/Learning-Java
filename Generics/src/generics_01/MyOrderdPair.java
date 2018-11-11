package generics_01;

public class MyOrderdPair <K,V> implements Pair<K, V> {

	private K key;
	private V value;
	
	public MyOrderdPair(K key, V value) {
	this.key = key;
	this.value = value;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value  ;
	}

}
