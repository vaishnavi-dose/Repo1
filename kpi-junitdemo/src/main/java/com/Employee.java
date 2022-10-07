package com;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	public Employee() {
		
	}
	int rollno;
	String name;

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String args[]){
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		Employee emp3= new Employee();
		List<Employee> list= new ArrayList();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
	
		//list.forEach(emp0->emp3.getRollno());
	}
}
