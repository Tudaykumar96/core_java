package com.exceptions.trywithresouces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResources {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("d:\\interview.excel"))){
			String str;
			while((str = br.readLine())!=null) {
			System.out.println(str);
			}
		} catch (ClassCastException | ArithmeticException| IOException |IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
