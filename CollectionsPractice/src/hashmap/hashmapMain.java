package hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmapMain {
	public static void main(String args[]) {
			//Creation
		//Null is allowed. Duplicates are not allowed. As in override ho jayega
		Map<Integer, String> m = new HashMap<Integer, String>(); 
		m.put(1, "Aman");
		m.put(2, "Aman");
		m.put(1, "Megha");
		m.put(null, "Aman");
		m.put(null, "M");	
		System.out.println(m);
		System.out.println(m.get(null));
	}
}
