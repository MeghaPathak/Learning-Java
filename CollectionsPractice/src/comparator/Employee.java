package comparator;

public class Employee implements Comparable<Employee> {
	String name;
	int rank;
	double salary;
	
	Employee(String name, int rank, double salary){
		this.name  = name;
		this.rank = rank;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.salary < o.salary)
				return -1;
		else if(this.salary < o.salary){
				return 1;
		}
		return 0;
	}

	public String toString(){
		return "Name::" + this.getName()+ "  " + "Rank::" + this.getRank() + "  " + "Salary::" + this.getSalary();		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
