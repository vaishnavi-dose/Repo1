package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {
	public static void checkingChornoEnum() {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is :" + date);
		
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("Next to Next Year is : " + year);
		
		LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
		System.out.println("The Next Month is :" + nextMonth);
		
		LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next Week is :" +nextWeek);
		
		LocalDate Decade = date.plus(2, ChronoUnit.DECADES);
		System.out.println("The Next Decades is : " +Decade);
		
	}
	public static void main(String args[]) {
		checkingChornoEnum();
	}
}
