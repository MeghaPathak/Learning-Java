package set;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(22);
		s.add(3);
		s.add(2);
		s.add(1);
		System.out.println("Hashset:::" + s);
		TreeSet<Integer> ts = new TreeSet<Integer>(s);
		System.out.println("Treeset:::" + ts);
		/*
		 * Please note that we have entered a duplicate entity but it is not
		 * displayed in the output. Also, we can directly sort the entries by
		 * passing the unordered Set in as the parameter of TreeSet).
		 */

		
		//addAll
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		System.out.println(a);
		System.out.println(s.contains(1));
		//allows null
		s.add(null);
		s.add(null);
		
		System.out.println(s.hashCode());
		
	}

}
