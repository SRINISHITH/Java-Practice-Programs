package com.niit.java.interfaces;

public class DepositAccount extends AbstractAccount {

	@Override
	public void openAccount() {
		System.out.println("account is open");
	
		
	}

	@Override
	public void closeAccount() {
		
		System.out.println("account is closed");
	}

	@Override
	public void withdraw(int amount) {
		System.out.println(amount +"amount withdraw");
		 
	}

	@Override
	public void deposit(int amount) {
		System.out.println(amount+"amount deposit");
		
		
	}
	

}
