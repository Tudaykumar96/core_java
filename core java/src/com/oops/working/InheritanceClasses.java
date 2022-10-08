package com.oops.working;

import java.security.SecureRandom;

public class InheritanceClasses extends SbiBank {
	public static void main(String[] args) {
		
		SbiBank sbi = new SbiBank();
		
		
	}
}

class Bank1 {
	public static String Ifsc;// global variables static
	public int branchCode;// gloabal variables instance
//which will have default values static variables will load all the places in our class
	// non static variables are not placed in the static block/methods directly

	public static double getBalance() {
		return new SecureRandom().nextDouble() * 1000;
	}// static methods also can place it to directly in static and non static

	public static String getIfsc() {
		return Ifsc;
	}

	public static void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "Bank [branchCode=" + branchCode + "]";
	}

}

class SbiBank extends Bank {
	
	static {
		String addressOfBank="assam";
		System.out.println("sbi ifsc code is : " + ifsc);
		Bank bank = new Bank();
		bank.setBranchCode("1234");
		bank.setIfsc("ieo124");
		System.out.println("sbi branch code is : " + bank.getBranchCode());
		System.out.println("sbi ifsc code is : " + bank.getIfsc());
		System.out.println(addressOfBank);

	}
	
	{
		String addressOfBank="up";
		
		System.out.println(addressOfBank);
		System.out.println("something");
		double balance = getBalance();
		System.out.println("balance = " + balance);
	}

}
