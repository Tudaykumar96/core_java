package com.oops.revision;

public class Account {
	public int accountNo;
	public static String accountHolderName;
	public String ifscCode;
	private static double balance;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}

	// static variables cant write the constructor inside it
	public Account() {
	}

	public static String getAccountHolderName() {
		return accountHolderName;
	}

	public static void setAccountHolderName(String accountHolderName) {
		Account.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ",accountHolderName=" + accountHolderName + ", ifscCode=" + ifscCode
				+ ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		System.out.println(getBalanceInfo(853428329));
		
	}

	
	public static Account getBalanceInfo(int accountNo) {
		Account account = null;
		account = new Account();
		account.setAccountNo(853428329);
		account.setAccountHolderName("trump");
		account.setIfscCode("sbi1234");
		account.setBalance(0);
		
		if (balance <= 0) {
			throw new AccountNotFoundException("Invalid balance" + " please verify once");
		} else {
			account.getBalance();
		}
		
		account.getAccountNo();
		account.getIfscCode();
		account.getBalance();
		account.getAccountHolderName();
		return account;

	}
}
