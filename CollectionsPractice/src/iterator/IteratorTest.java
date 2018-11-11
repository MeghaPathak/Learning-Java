package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
	
		for (int i = 0; i < 10; i++) l.add(i);
		
		Iterator<Integer> it = l.iterator();
	
	
		while (it.hasNext()) {
			int j = (int) it.next();
			System.out.print(j);
			it.remove();

		}
		System.out.println(l);

	}

	// public static void main(String[] args)
	// {
	// ArrayList al = new ArrayList();
	//
	// for (int i = 0; i < 10; i++)
	// al.add(i);
	//
	// System.out.println(al);
	//
	// // at beginning itr(cursor) will point to
	// // index just before the first element in al
	// Iterator itr = al.iterator();
	//
	// // checking the next element availabilty
	// while (itr.hasNext())
	// {
	// // moving cursor to next element
	// int i = (Integer)itr.next();
	//
	// // getting even elements one by one
	// System.out.print(i + " ");
	//
	// // Removing odd elements
	// // if (i % 2 != 0)
	// // itr.remove();
	// }
	// System.out.println();
	// System.out.println(al);
	// }
}
