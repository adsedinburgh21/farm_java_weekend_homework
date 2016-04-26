package com.codeclan.md;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount bank;
	
	@Before
	public void setup(){
		bank = new BankAccount("Steve Farmer", 500);
	}
	
	@Test
	public void testAccountHolder(){
		assertEquals(bank.getAccountHolder(), "Steve Farmer");
	}
	
	@Test
	public void testGetBankBalance(){
		assertEquals(bank.getBalance(), 500, 0.001);
	}
	
	@Test
	public void testDebit(){
		bank.debit(50);
		assertEquals( bank.getBalance(), 450, 0.001);
	}

	@Test
	public void testCredit(){
		bank.credit(50);
		assertEquals( bank.getBalance(), 550, 0.001);
	}
	

}
