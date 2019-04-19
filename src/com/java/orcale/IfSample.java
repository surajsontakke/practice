package com.java.orcale;

public class IfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 10;
		y = 20;
		if (x < y) {
			System.out.println("X is less than y");
		}
		x = x * 2;
		if (x == y) {
			System.out.println("x is now equal to y");
		}
		x = x * 2;
		if (x > y) {
			System.out.println("X is greater than y");
		}
		if (x == y) {
			System.out.println("You won't see this");
		}

	}

}
