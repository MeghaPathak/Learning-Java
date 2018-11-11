package enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
	 Vector<Integer> v = new Vector<Integer>();
	 
	 for (int i=0; i<10; i++){
		 v.add(i);
	 }
	 Enumeration e = v.elements();
	 while(e.hasMoreElements()){
		 System.out.println(e.nextElement());
	 }

	}

}
