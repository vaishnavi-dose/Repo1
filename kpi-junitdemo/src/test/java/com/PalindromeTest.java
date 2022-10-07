package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {
	@Test
	public void evaluatesExpression() {
		Palindrome pn =new Palindrome();
		String sol=pn.pallindrome(161);
		assertEquals("Pallindrome", sol);
	}

}

