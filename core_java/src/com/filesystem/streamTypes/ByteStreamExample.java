package com.filesystem.streamTypes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	public static void main(String[] args) throws IOException {
		ByteStreamExample byteStreamExample = new ByteStreamExample();
		byteStreamExample.byteStream();
	}

	public void byteStream() throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			String inputFile = "D:\\malli\\FileSystem\\input.txt";
			fis = new FileInputStream(inputFile);

			String outputFile = "D:\\malli\\FileSystem\\ouptput.txt";
			fos = new FileOutputStream(outputFile);
			
			
			int x;
			System.out.println("variables ");

			while ((x = fis.read()) != -1) {
				fos.write(x);
			
				System.out.println(fos);
				
			}
		} finally {
			if (fis != null)
				fis.close();
			if (fos != null)
				fos.close();
		}
	}
}
