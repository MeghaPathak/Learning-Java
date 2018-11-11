package comparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		//Sort by comparable (salary wala)
		System.out.println("*******Sort By salary :: Comparable");
		Demo.sortbyComparable();

		//Sort by comparable (salary wala)
		System.out.println("*******Sort By Rank :: Comparator");
		Demo.sortByRank();
		
	}
	
	public  static void sortbyComparable(){
		List<Employee> a = Demo.createList(); 
		Collections.sort(a);
		Iterator<Employee> itr = a.iterator();
		while(itr.hasNext()){
			Employee e = (Employee)itr.next();
			System.out.println(e);
		}
	}
	
	public static void sortByRank(){
		List<Employee> a = Demo.createList(); 
		Collections.sort(a, new SortEmployeeByRank());
		Iterator<Employee> itr = a.iterator();
		while(itr.hasNext()){
			Employee e = (Employee)itr.next();
			System.out.println(e);
		}	
	}
	
	public static List<Employee> createList(){
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee("Megha1", 1, 400));
		a.add(new Employee("Megha2", 4, 100));
		a.add(new Employee("Megha3", 14, 200));
		a.add(new Employee("Megha4", 10, 500));
		a.add(new Employee("Megha5", 2, 200));
		a.add(new Employee("Megha4", 8, 10000));
		return a;
		
	}

/* Suppose we want sort Employee by their rank and names also.
 * When we make a collection element comparable(by having it implement Comparable), 
 * we get only one chance to implement the compareTo() method.
 * The solution is using Comparator.
 * */
}
