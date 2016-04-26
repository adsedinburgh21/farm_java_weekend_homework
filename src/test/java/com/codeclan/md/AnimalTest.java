package com.codeclan.md;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	
	Animal animal;
	
	@Before
	public void setup(){
		animal = new Animal("cow", 1, 100 );
	}
	
	
	@Test
	public void testAnimalType(){
		assertEquals( animal.getType(), "cow");
	}
	
	@Test
	public void testGetAnimalId(){
		assertEquals( animal.getId(), 1);
	}
	
	@Test
	public void testSetAnimalId(){
		animal.setId(21);
		assertEquals( animal.getId(), 21);
	}
	
	@Test
	public void testAnimalValue(){
		assertEquals( animal.getValue(), 100, 0.001);
	}

	@Test
	public void testSetAnimalValue(){
		animal.setValue(200);
		assertEquals( animal.getValue(), 200, 0.001);
	}
	
	@Test
	public void testEatAndGetStomachContent(){
		AnimalFood a = new AnimalFood();
		AnimalFood b = new AnimalFood();
		animal.eat(a);
		animal.eat(b);
		assertEquals( animal.getStomachContent(), "Food Pellets, Food Pellets, ");
	}

}
