package com.filesystem.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		FileReaderExample fileReaderExample = new FileReaderExample();
		fileReaderExample.readFile();
	}

	public void readFile() {
		File file = new File("Hello1.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileWriter writer = null;
		FileReader reader = null;
		try {
			writer = new FileWriter(file);
			writer.write("this\n is\n an\n example\n of\nfile\n reader\n");
			writer.flush();

			reader = new FileReader(file);
			char[] a = new char[50];
			int x = reader.read(a);
			System.out.println( x);
			for (char c : a)
				System.out.println(c);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (writer != null) {
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
}
