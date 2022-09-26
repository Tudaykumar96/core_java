package com.sd.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {
	// converts the state of an object from java object form into file or network file form
	//fileoutputstream and objectoutputstream which has a method called writeobject(object)
	public static void main(String[] args) throws IOException {
		serializeMethod();
	}
	public static void serializeMethod() throws IOException {
		String filename = "abc.ser";
		serializeDemo demo = new serializeDemo(1,"abcd");
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(demo);
			oos.close();
			fos.close();
			System.out.println("serialization started..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
class serializeDemo implements Serializable{
	int a;
	String b;
	public serializeDemo(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
}
