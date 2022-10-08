package com.exceptions.trywithresouces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TrywithoutResources {
	//using finally block
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			
			String s;
			br = new BufferedReader(new FileReader("d:\\interview"));
			while((s= br.readLine())!=null){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(br!=null)
					br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
