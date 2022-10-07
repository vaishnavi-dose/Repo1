package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date1 
{
	public static void LocalDateTimeApi()
	{
		LocalDate date2 = LocalDate.of(1922, 01, 26);
		System.out.println("This Day is Celebrated as a Republic Day :" +date2);
		
		//LocalDateTime current = LocalDateTime.now();
		//System.out.println("Current Date and Time is :"+ current);
		
		//Month month = current.getMonth();
		//int day = current.getDayOfMonth();
		//int year = current.getYear();
		
		//System.out.println("Month : " + month + " Day : " + day + " Year : " + year);
	}
	
	public static void main(String args[]) {
		LocalDateTimeApi();
	}
}
