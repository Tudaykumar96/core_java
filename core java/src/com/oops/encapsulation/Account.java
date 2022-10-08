package com.oops.encapsulation;

//encapsulation = datahiding + abstraction
public class Account {
	private double balance;//datahiding is declaring the private variable

	public double getBalance() {
		return balance;
	}
	//nothing but abstraction we dont know the internal implementaion of getting and setting the balance.
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(1000);
		a.getBalance();
		System.out.println(a);
	}
	

}
