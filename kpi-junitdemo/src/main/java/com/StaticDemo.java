package com;

public class StaticDemo extends Student {
	
	  
	public StaticDemo(String name)
	{
	super(name);
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args)
	{
		// calling static method
		// without instantiating Student class
		Student.setCllg("XYZ");

		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");

		s1.getStudentInfo();
		s2.getStudentInfo();
	}


}
