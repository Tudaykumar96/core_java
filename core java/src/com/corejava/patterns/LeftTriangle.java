package com.corejava.patterns;

public class LeftTriangle {
	public static void leftTrinagle(int n) {
		int i = 0;
		int j = 0;
		for(i=0; i<n;i++) {
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 5;
		leftTrinagle(n);

	}
}
