package com.filesystem.iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {
		FileExample example = new FileExample();
		example.createFile();
	}
	public void createFile() {
		File f = null;
		String[] s = {"text1.txt","text2.txt"};
		for(String str:s) {
			f = new File(str);
			boolean b = f.canExecute();
			String a = f.getAbsolutePath();
			System.out.println(a);
			System.out.println("is executable: "+ b);
			
		}
	}

}
