package com.oops.inheritance;

public class Employee {
	public float salary = 4000;
}
class Company extends Employee{
	private double bonus = 1000;
	double d = salary+bonus;
	public static void main(String[] args) {
		Company c = new Company();
		System.out.println(c.bonus+ " bonus you got");
		System.out.println("your salary is : "+ c.salary);
		
		System.out.println("Total salary is: "+c.d);
	}
}