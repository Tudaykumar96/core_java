package com.sd.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {
	public static void main(String[] args) {
		serialize();
		deserialize();
	}

	public static void serialize() {
		System.out.println("serialization ....");
		Employee e = new Employee();
		e.ename = "george";
		e.address = "11-117/banglore/karnataka";
		e.ssn = 112233;
		e.number = 123;
		e.mailCheck();

		try {
			FileOutputStream fos = new FileOutputStream("serializable.ser");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(e);
			out.close();
			fos.close();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}
	public static void deserialize() {
		System.out.println("deserialization....");
		Employee e = null;
		try {
			FileInputStream fis = new FileInputStream("serializable.ser");
			ObjectInputStream in = new ObjectInputStream(fis);
			e = (Employee) in.readObject();
			
			in.close();
			fis.close();
		} catch (IOException | ClassNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		System.out.println("Name : " + e.ename);
		System.out.println("address : " + e.address);
		System.out.println("ssn : " + e.ssn);
		System.out.println("Number : " + e.number);
	}
}

