package com.codeclan.md;

import java.util.ArrayList;

public abstract class Animal {
	
	protected int id;
	protected double value;
//	protected ArrayList<AnimalFood> stomach;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
//	public ArrayList<AnimalFood> getStomach() {
//		return stomach;
//	}
//	
//	public void eat(AnimalFood animalFood){
//		stomach.add(animalFood);
//	}
	
	
}
