package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void LocalDateTimeApi()
	{
		LocalDate date = LocalDate.now();
		System.out.println("The current Date is :"+ date);
		
		LocalTime time = LocalTime.now();
		System.out.println("The Current Time is :"+ time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time is :"+ current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		
		String formatedDateTime = current.format(format);
		
		System.out.println("In Formatted Manner"+ formatedDateTime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int hour = current.getHour();
		int year = current.getYear();
		System.out.println("Month :" + month + " Day :" + day + " Seconds :" + seconds + "Hours :" + hour + "Year :" + year);
		
		LocalDate date2 = LocalDate.of(2000, 12, 10);
		System.out.println("My Birth Day :"+date2);
		
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
		System.out.println("Specific Date with " + "Current Time :" +specificDate);
	}
	
	public static void main(String args[]) {
		LocalDateTimeApi();
	}
}
