package com.sd.serialization;

import java.io.Serializable;

//any class should acts as serializable must and should implements serializable interface.
public class Employee implements Serializable {
	// converting an object form into file form or network form
	public String ename;
	public String address;
	public transient int ssn;
	public int number;

	public void mailCheck() {
		System.out.println("mail is checking " + ename + " " + address);
	}
}

