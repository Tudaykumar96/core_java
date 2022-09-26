package com.sd.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeseraializationExampleTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		readSerializableMethod();
	}
	public void printEmployeeData(Employee1 emp) {
		System.out.println("name: "+ emp.name);
		System.out.println("id: "+ emp.id);
		System.out.println("age: "+ emp.age);
		System.out.println("gender: "+ emp.gender);
	}

	public static void readSerializableMethod() throws IOException, ClassNotFoundException {
		Employee1 emp1 = new Employee1("uday", 101, 29, "male");
		String filename = "empinfo.txt";
		emp1.id=103;
		try {
			System.out.println("deserialization started...");
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			in.readObject();
			in.close();
			file.close();
			System.out.println(emp1.id);
			System.out.println(emp1.name);
			System.out.println(emp1.age);
			System.out.println(emp1.gender); 
			System.out.println("deserialization ended...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Employee1 implements Serializable {
	private static final long serialversionUID = 129348938L;
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
