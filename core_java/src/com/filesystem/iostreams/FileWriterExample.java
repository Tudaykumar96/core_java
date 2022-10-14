package com.filesystem.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		writeFile();
		
	}
	public static void writeFile() {
		File file = new File("welcome.txt");
		FileWriter writer = null;
		FileReader reader = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("This is an filewriter example");
			writer.flush();
			
			reader = new FileReader(file);
			char[] a = new char[50];
			reader.read(a);
			
			for(char c:a) {
				System.out.println(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				writer.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
