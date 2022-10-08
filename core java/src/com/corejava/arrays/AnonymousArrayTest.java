package com.corejava.arrays;

public class AnonymousArrayTest {
	public static int sum(int a[]) {
		int total=0;
		for(int x:a) {
			total=total+1;
		}
		return total;
	}
	public static void main(String[] args) {
	    System.out.println(sum(new int[]{1,2,2,3,3,4,4,5}));
		
	}
}
