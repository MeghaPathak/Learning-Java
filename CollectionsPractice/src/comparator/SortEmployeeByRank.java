package comparator;

import java.util.Comparator;

public class SortEmployeeByRank implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getRank() < o2.getRank())
			return -1;
		if (o1.getRank() < o2.getRank())
			return 1;
		return 0;
	}
	

}
