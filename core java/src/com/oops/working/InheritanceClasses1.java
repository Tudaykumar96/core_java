package com.oops.working;

import java.security.SecureRandom;

public class InheritanceClasses1 {
	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.getSbiDetails();
		Icici icici = new Icici();
		icici.getIciciDetails();
		
	}
}

class Bank {
	static String ifsc;
	String branchCode;

	public static String getIfsc() {
		return ifsc;
	}

	public static void setIfsc(String ifsc) {
		Bank.ifsc = ifsc;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "Bank [branchCode=" + branchCode + "]";
	}

	public double getBalance() {
		return new SecureRandom().nextDouble() * 1000;
	}

	
}

class Sbi extends Bank {
	public void getSbiDetails() {
		Bank b = new Bank();
		
		b.setBranchCode("sbi124");
		b.setIfsc("83248");
		System.out.println("new balance is : " + b.getBalance());
		System.out.println("My branch code is : " + b.getBranchCode());
		System.out.println("bank ifsc Code is : " + b.getIfsc());
	}
}

class Icici extends Bank {
	public void getIciciDetails() {
		Bank b = new Bank();
	
		b.setBranchCode("icici12345");
		b.setIfsc("325123");
		System.out.println("new balance is : " + b.getBalance());
		System.out.println("My branch code is : " + b.getBranchCode());
		System.out.println("bank ifsc Code is : " + b.getIfsc());
	}

}