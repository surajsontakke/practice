package com.java.test;

import java.util.Scanner;

public class DigitToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, rem = 0, sum = 0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num: ");
		num = scan.nextInt();

		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}
		System.out.println("Sum of digits of " + temp + " is " + sum);
	}

}
