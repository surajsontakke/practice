package com.java.test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, result;
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Addition :");
			System.out.println("2. substraction :");
			System.out.println("3. multiplication :");
			System.out.println("4. division :");
			System.out.println("5. module :");
			System.out.println("6. Exit :");
			System.out.println("Enter your choice: ");
			choice = sc.next().charAt(0);
			switch (choice) {
			case '1':
				System.out.println("Enter two number:");
				a = sc.nextFloat();
				b = sc.nextFloat();
				result = a + b;
				System.out.println("result:" + result);
				break;
			case '2':
				System.out.println("Enter two number:");
				a = sc.nextFloat();
				b = sc.nextFloat();
				result = a - b;
				System.out.println("result:" + result);
				break;
			case '3':
				System.out.println("Enter two number:");
				a = sc.nextFloat();
				b = sc.nextFloat();
				result = a * b;
				System.out.println("result:" + result);
				break;
			case '4':
				System.out.println("Enter two number:");
				a = sc.nextFloat();
				b = sc.nextFloat();
				result = a / b;
				System.out.println("result:" + result);
				break;
			case '5':
				System.out.println("Enter two number:");
				a = sc.nextFloat();
				b = sc.nextFloat();
				result = a % b;
				System.out.println("result:" + result);
				break;
			case '6':
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice!!!!");
				break;
			}
			System.out.println("\n---------------------------------------\n");

		} while (choice != 6);

	}

}
