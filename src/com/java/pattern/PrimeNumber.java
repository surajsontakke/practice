package com.java.pattern;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		num = scan.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("This is prime number");
		} else {
			System.out.println("This is not prime number");
		}
	}
}
