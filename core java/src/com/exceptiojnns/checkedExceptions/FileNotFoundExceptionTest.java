package com.exceptiojnns.checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionTest {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			// either u can use try catch or throws to handle the exception.
			// any way here file is not pick up because there is no corresponding files
			// exists
			FileInputStream fis = new FileInputStream("desktop/corejava.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file not found exception caught");
		}
		//suppose if the file is exists in the given path the how it will treats
		FileInputStream fis = new FileInputStream("d://Abc.txt");
		try {
			System.out.println(fis.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
