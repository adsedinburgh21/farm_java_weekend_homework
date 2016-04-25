package com.codeclan.md;

public class Farmer {
	
	private String name;
	private double bankBalance;
	
	
	public Farmer(String name){
		this.name = name;
		bankBalance = 0;
	}
	public Farmer(String name, double bankBalance){
		this.name = name;
		this.bankBalance = bankBalance;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void debit(double amount){
		bankBalance -= amount;
	}
	public void credit(double amount){
		bankBalance += amount;
	}
	
	
}
