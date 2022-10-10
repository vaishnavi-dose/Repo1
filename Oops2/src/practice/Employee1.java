package practice;

public class Employee1 implements Leaves,Salary{

	@Override
	public int sal(int x) {
		// TODO Auto-generated method stub
		return 28000;
	}

	@Override
	public int sick_Leave() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int casual_Leave() {
		// TODO Auto-generated method stub
		return 7;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp= new Employee1();
		
		System.out.println(emp.sick_Leave());
		System.out.println(emp.casual_Leave());
		System.out.println(emp.sal(1));

	}

}
