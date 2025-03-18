package emp;

public abstract class Employee {
	
	private String name;
	private int number;
	private String department;
	private int salary;  //100
	
	//기본생성자
	public Employee(){}
	
	//4개 값을 받는 생성자
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	
	public abstract double tax();
	
	int getSalary() {
		return salary;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDepartment() {
		return department;
	}
	
	

}
