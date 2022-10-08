package com.Exception.uncheckedExceptions;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IllegalStateException {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("welcome");
		list.add("to");
		list.add("illegalstateException");
		System.out.println(list);
		ListIterator iterator = list.listIterator();
		Object obj =  iterator.next();
		System.out.println(obj);
		System.out.println("next value");
		try {
		iterator.remove();
		}catch(IllegalArgumentException e) {
			System.out.println("handling exception");
		}
		iterator.set("all are gone");
		System.out.println(list);
	}
}
