package com.codeclan.md;

public class BankAccount {
	
	private String accountHolder;
	private double balance;
	
	
	public BankAccount(String accountHolder){
		this.accountHolder = accountHolder;
		balance = 0;
	}
	public BankAccount(String accountHolder, double bankBalance){
		this.accountHolder = accountHolder;
		this.balance = bankBalance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void debit(double amount){
		balance -= amount;
	}
	public void credit(double amount){
		balance += amount;
	}
	
}
