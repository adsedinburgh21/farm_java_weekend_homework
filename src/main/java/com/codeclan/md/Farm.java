package com.codeclan.md;

import java.util.ArrayList;

public class Farm {
	
	private String name;
	private ArrayList<Animal> animals;
	private BankAccount bankAccount;

	
	public Farm( BankAccount bankAccount){
		name = "Farm";
		animals = new ArrayList<Animal>();
		this.bankAccount = bankAccount;
	}
	
	public Farm( BankAccount bankAccount, String farmName){
		name = farmName;
		animals = new ArrayList<Animal>();
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public BankAccount getBankAccount(){
		return bankAccount;
	}
	
	public void buyAnimal( Animal animal){
		animals.add(animal);
		bankAccount.debit(animal.getValue());
	}

	public void sellAnimal( int animalId){
		for( Animal i : animals){
			if( i.getId() == animalId){
				animals.remove(i);
				bankAccount.credit(i.getValue());
			}
		}	
	}
	
	public String listAnimals() {
		String list = "";
		for( Animal i : animals){
			list += i.getType()+": Id="+i.getId()+", ";
		}
		return list;
	}

	
	
	
}
