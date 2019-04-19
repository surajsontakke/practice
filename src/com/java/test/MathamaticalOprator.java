package com.java.test;

import java.util.Scanner;

public class MathamaticalOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		double result;
		char ch;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Enter Operator (+, -, *, /,%) : ");
		ch = sc.next().charAt(0);

		if (ch == '+') {
			result = a + b;
			System.out.println("Result: " + result);

		} else if (ch == '-') {
			result = a - b;
			System.out.println("Result: " + result);
		} else if (ch == '*') {
			result = a * b;
			System.out.println("Result: " + result);
		} else if (ch == '/') {
			result = a / b;
			System.out.println("Result: " + result);
		} else if (ch == '%') {
			result = a % b;
			System.out.println("Result: " + result);
		} else {
			System.out.println("Wrong Operator !!!");
		}

	}

}
