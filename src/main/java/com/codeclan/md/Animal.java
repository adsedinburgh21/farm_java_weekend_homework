package com.codeclan.md;

import java.util.ArrayList;

public class Animal {
	
	private int animalId;
	private double value;
	private String type;
	private ArrayList<AnimalFood> stomach;
	
	public Animal(String type, int animalId, double value){
		this.type = type;
		this.animalId = animalId;
		this.value = value;
		this.stomach = new ArrayList<AnimalFood>();
	}
	
	public String getType() {
		return type;
	}
	public int getId() {
		return animalId;
	}
	public void setId(int id) {
		this.animalId = id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getStomachContent() {
		String list = "";
		for( AnimalFood af : stomach){
			list += af.getType()+", ";
		}
		return list;
	}
	public void eat(AnimalFood animalFood){
		stomach.add(animalFood);
	}
	
	
}
