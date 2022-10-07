package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time {

	public static void checkChrono()
	{
		LocalDate date = LocalDate.now();
		
		LocalDate year = date.plus(8, ChronoUnit.YEARS);
		System.out.println("Date on Wednesday of 2030 is : " + year);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkChrono();
	}

}

