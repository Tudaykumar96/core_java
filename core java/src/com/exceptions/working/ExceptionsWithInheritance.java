package com.exceptions.working;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ExceptionsWithInheritance {
	public static void main(String[] args) throws SQLException {
		Child c = new Child();
		c.m1();
	}

}
class Parent {
	void m1() throws SQLException {
		System.out.println("parent");
	}
}
class Child extends Parent{
	void m1() throws SQLDataException {
		System.out.println("child");
	}
}
