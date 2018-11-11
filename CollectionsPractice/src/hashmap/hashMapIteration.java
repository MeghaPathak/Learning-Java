package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashMapIteration {
	public static void main(String args[]) {
	/*
	 * We cannot iterate a Map directly using iterators, because Map are not Collection.
	 */ 
		
		Map<Integer, String> m = new HashMap<Integer, String>(); 
		m.put(1, "Aman");
		m.put(2, "Aman");
		m.put(3, "MeghaAman");
		Set k=m.entrySet();
	
		//Using entry set for both key and value
		System.out.println("*******Using entry set for both key and value");
		for(Map.Entry<Integer, String> entry:m.entrySet()){
			System.out.println(entry.getKey() + "::"+ entry.getValue());
		}
		
		//using keySet for only keys
		System.out.println("*******Using keyset for key");
		for(Integer i:m.keySet()){
			System.out.println(i);
		}
		
		//using values() for only values
		System.out.println("*********Using values() for value");
		for(String i:m.values()){
			System.out.println(i);
		}
		
		//using Iterator: Logic is that set is iterable
		System.out.println("*******Using Iterators");	
		java.util.Iterator<Map.Entry<Integer, String>> itr = m.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, String> obj = itr.next();
			System.out.println(obj.getKey() + "::" + obj.getValue());
		}
		
		//using Iterator: without cast
		System.out.println("*******Using Iterators- Without cast");			
		java.util.Iterator i = m.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry m1 = (Map.Entry) i.next();
			System.out.println(m1.getKey() + "::" + m1.getValue());
		}
		
	}
}


/** Just trying out nested interface like Entry set */
interface A{
	
	interface b{
		public void someMethod();
	}
}

class SomeClass implements A.b{

	@Override
	public void someMethod() {
		
	}
	
}