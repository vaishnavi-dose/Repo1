package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust 
{
	public static void checkingAdjusters() {
		
		LocalDate date = LocalDate.now();
		System.out.println("The Current Date is :" +date);
		
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First Day Of Next Month:" +dayOfNextMonth);
		
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday from now is :" +nextSaturday);
		
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day of Month is :" + firstDay);
		
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last Day of Month is : " + lastDay);
	}
	
	public static void main(String args[]) {
		checkingAdjusters();
	}
}
