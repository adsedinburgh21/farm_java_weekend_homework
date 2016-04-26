package com.codeclan.md;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FarmTest {
	
	Farm farm;
	Animal animal1;
	Animal animal2;
	
	@Before
	public void setup(){
		BankAccount b = new BankAccount("Steve Farmer", 1000);
		farm = new Farm(b, "Edinburgh Farm");
		animal1 = new Animal("cow", 1, 200);
		animal2 = new Animal("cow", 2, 400);
	}
	
	@Test
	public void testName(){
		assertEquals( farm.getName(), "Edinburgh Farm");
	}
	
	@Test
	public void testBuyAnimal(){
		farm.buyAnimal(animal1);
		assertEquals( farm.getBankAccount().getBalance(), 800, 0.001);
		assertEquals( farm.listAnimals(), "cow: Id=1, ");
	}
	
	@Test
	public void testSellAnimal(){
		farm.buyAnimal(animal1);
		farm.buyAnimal(animal2);
		farm.sellAnimal(2);
		assertEquals( farm.listAnimals(), "cow: Id=1, ");
		assertEquals( farm.getBankAccount().getBalance(), 800, 0.001);
		
	}
	
}
