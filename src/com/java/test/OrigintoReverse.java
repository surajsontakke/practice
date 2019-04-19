package com.java.test;

import java.util.Scanner;

public class OrigintoReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, orig, rev = 0, rem;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		num = scan.nextInt();

		orig = num;
		while (num > 0) {
			rem = num % 10; //0
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (orig == rev) {
			System.out.println("Reverse is Equal to Original");
		} else {
			System.out.print("Reverse is not Equal to Original");
		}

	}

}
