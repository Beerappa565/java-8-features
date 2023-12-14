package Java8Features;

public class Employee {

	String name;
	String gender;
	String deparatment;
	long salary;
	
	public Employee(String name, String gender, String deparatment, long salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.deparatment = deparatment;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDeparatment() {
		return deparatment;
	}
	public void setDeparatment(String deparatment) {
		this.deparatment = deparatment;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long l) {
		this.salary = l;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", deparatment=" + deparatment + ", salary=" + salary
				+ "]";
	}
	
	
}

