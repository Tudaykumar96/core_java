package com.filesystem.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BufferedReaderExample {
	private static  SaveFileInDatabase saveFileDatabase;
	
	static String SQL_QUERY = "insert into empinfo values(?)";
	public static void main(String[] args) {
		buffReader();
	}

	public static void saveFileData(String line) {
		saveFileDatabase = new SaveFileInDatabase();
		try(Connection con = saveFileDatabase.connection();
				PreparedStatement pstmt = con.prepareStatement(SQL_QUERY)){
			
			pstmt.setString(1,line);
			pstmt.execute();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static  void buffReader() {
		BufferedReader bufferedReader = null;
		String file = "D:\\Abc.txt";
		try {

			bufferedReader = new BufferedReader(new FileReader(file));
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				saveFileData(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
