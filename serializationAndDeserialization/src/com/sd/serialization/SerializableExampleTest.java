package com.sd.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExampleTest {
	public static void main(String[] args) throws IOException {
		
		SerializableExampleTest test = new SerializableExampleTest();
		test.writeSerializableMethod();
		
	}
	 
	public  void printEmployeeData(Employee1 emp) {
		System.out.println("name: "+ emp.name);
		System.out.println("id: "+ emp.id);
		System.out.println("age: "+ emp.age);
		System.out.println("gender: "+ emp.gender);
	}
	public void writeSerializableMethod() throws IOException {
		Employee1 emp1 = new Employee1("uday",101,29,"male");
		String filename = "empinfo.txt";
		try {
			System.out.println("serialization started...");
			FileOutputStream fos = new  FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(emp1);
			out.close();
			fos.close();
			System.out.println("serialization ended...");
			printEmployeeData(emp1);
			emp1.id=103;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 class Employee1 implements Serializable {
	private static final long serialversionUID =
            129348938L;
	String name;
	transient int id;
	static int age;
	String gender;
	public Employee1(String name, int id, int age, String gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
	}
	
	
}
