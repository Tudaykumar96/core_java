package com.sd.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserailalizationTest {
	// converts the state of the object form the file or a network file form into the java object form.
	// fileinputstream  and objectoutputstream which has a readObject() with return type as object.
	public static void main(String[] args) {
		Demo demo = new Demo(1,"ayz");
		String filename = "file.ser";
		 try
	        {   
	            // Reading the object from a file
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);
	              
	            // Method for deserialization of object
	          in.readObject();
	              
	            in.close();
	            file.close();
	              
	            System.out.println("Object has been deserialized ");
	            System.out.println("a = " + demo.a);
	            System.out.println("b = " + demo.b);
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	          
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
	  
	    }
	}
class Demo implements java.io.Serializable
{
    public int a;
    public String b;
  
    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
  
}