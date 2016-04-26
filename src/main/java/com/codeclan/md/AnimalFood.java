package com.codeclan.md;

public class AnimalFood {
	
	private String type;
	
	public AnimalFood()
	{
		type = "Food Pellets";
	}
	
	public AnimalFood( String type)
	{
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
