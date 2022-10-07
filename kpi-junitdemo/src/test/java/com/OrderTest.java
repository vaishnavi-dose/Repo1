package com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest 
{
	@Test
	public void evaluatesExpression() {
		Order os= new Order("2 Oct", 49, "Delivered");
		assertEquals("2 Oct", os.Order_Date);
		assertEquals(49, os.Order_No);
		assertEquals("Delivered", os.Order_Status);
	}
}

