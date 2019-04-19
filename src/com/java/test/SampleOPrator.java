package com.java.test;

import java.util.Scanner;

public class SampleOPrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		double res;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number:");
		
		a = scan.nextInt();
		b = scan.nextInt();

		res = a + b;
		System.out.println("Addition :" + res);
		res = a - b;
		System.out.println("substraction :" + res);
		res = a * b;
		System.out.println("multiplication :" + res);
		res = a / b;
		System.out.println("division :" + res);
		res = a % b;
		System.out.println("module :" + res);

	}

}
