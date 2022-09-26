package oops;

public class Employer {
	
	String name;
	int salary;
	int empID;
	protected int getEmpID() {
		return empID;
	}
	protected void setEmpID(int empID) {
		this.empID = empID;
	}
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
