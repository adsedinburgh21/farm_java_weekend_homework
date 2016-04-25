package com.codeclan.md;

import static org.junit.Assert.*;

import org.junit.Test;

public class FarmerTest {
	
	@Test
	public void testname(){
		Farmer farmer = new Farmer("Steve");
		assertEquals(farmer.getName(), "Steve");
	}
	
	@Test
	public void testBankBalance(){
		Farmer farmer = new Farmer("Steve");
		assertEquals(farmer.getBankBalance(), 0);
	}// *********************************************************
	///// WHY DOESNT ASSERTEQUALS WORK HERE?
	// **********************************************************

	

}
