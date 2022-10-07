package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeNoTest 
{
	@Test
	public void evaluatesExpression() {
		PrimeNumber prime =new PrimeNumber();
		String sol=prime.pm(13);
		assertEquals("Prime Number", sol);
	}
}

