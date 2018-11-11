package listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		List l = new ArrayList();
		

		for (int i = 0; i < 10; i++) l.add(i);
		ListIterator it = l.listIterator();
		
		while(it.hasNext()){
			System.out.print(it.next());
//			it.set(100000);
		}
		
//		it.add(11);
		
		while(it.hasPrevious()){
			System.out.print(it.previous());
		}
	}

}
