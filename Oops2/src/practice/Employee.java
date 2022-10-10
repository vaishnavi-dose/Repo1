package practice;

public class Employee 
{
	Employee()
	{
		System.out.println("Default Constructor");
	}
	Employee(int Emp_id, int salary)
	{
		System.out.println("Employee Id and Salary");
	}
	Employee(String Name, String Address)
	{
		System.out.println("Employee Name and Address");
	}
	public static void main(String args[]) {
		Employee a= new Employee();
		Employee b= new Employee(9182, 28800);
		Employee c= new Employee("Vaishnavi", "Jalgaon");
	}
}
