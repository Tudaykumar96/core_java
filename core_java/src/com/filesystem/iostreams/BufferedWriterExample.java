package com.filesystem.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	public static void main(String[] args) {
		buffWriter();
	}
	public static void buffWriter() {
		FileWriter writer = null;
		BufferedWriter bufferedWriter = null;
		String file="welcome1.txt";
		
		try {
			writer = new FileWriter(file);
			bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("100");
			bufferedWriter.newLine();
			bufferedWriter.write("you are doing good");
			bufferedWriter.newLine();
			char[] ch = {'a','b','c'};
			bufferedWriter.write(ch);
			bufferedWriter.newLine();
			bufferedWriter.write("we are done");
			bufferedWriter.flush();
	
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
