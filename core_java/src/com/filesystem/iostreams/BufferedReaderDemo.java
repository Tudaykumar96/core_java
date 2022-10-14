package com.filesystem.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee employee = new Employee();
		employee.readData();
		System.out.println("main mehtod");
	}

}

class Employee {
	String name;
	int id;
	int age;
	String gender;

	public Employee() {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
	}

	private static SaveFileInDatabase saveFileInDatabase;

	private void saveData() throws ClassNotFoundException {
		try (Connection conn = SaveFileInDatabase.connection();
				PreparedStatement pstmt = conn.prepareStatement("insert into employee values(?,?,?,?)")) {
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, gender);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void readData() throws ClassNotFoundException {
		try (Scanner input = new Scanner(new File(
				"D:\\uday_core_java\\core_java\\core_java\\src\\com\\filesystem\\iostreams\\\\empDetails.txt"))) {
			while (input.hasNextLine()) {
				
				String line;
				line = input.nextLine();
				try (Scanner data = new Scanner(line)) {
					while (!data.hasNextInt()) {
						name += data.next() + " ";
					}
					name = name.trim();
					if (data.hasNextInt()) {
						id = data.nextInt();
					}
					if (data.hasNextInt()) {
						age = data.nextInt();

					}
					if (data.hasNext()) {
						gender = data.next();
					}
				}
				System.out.println(name + "\t" + id + "\t" + age + "\t" + gender);
				saveData();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + "]";
	}
}
