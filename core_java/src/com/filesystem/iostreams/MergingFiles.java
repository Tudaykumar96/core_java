package com.filesystem.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergingFiles {
	public static void main(String[] args) {
		MergingFiles mergeFiles = new MergingFiles();
		mergeFiles.mergeFiles();
	}
	public void mergeFiles() {
		BufferedReader reader= null;
		
		try {
			
			PrintWriter pw = new PrintWriter("file3.txt");
			
			 reader = new BufferedReader(new FileReader("D:\\uday_core_java\\core_java\\core_java\\src\\com\\filesystem\\iostreams\\file1.txt"));
			String line1 = reader.readLine();
			
			while(line1 !=null) {
				pw.println(line1);
				
				line1 = reader.readLine();
			}
			reader = new BufferedReader(new FileReader("D:\\uday_core_java\\core_java\\core_java\\src\\com\\filesystem\\iostreams\\file2.txt"));
			String line2 = reader.readLine();
			while(line2 !=null) {
				pw.println(line2);
				
				line2 = reader.readLine();
			}
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			if(reader!=null) {
				try {
					reader.close();
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
