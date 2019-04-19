package com.java.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, end, i, j, count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number: ");
		start = sc.nextInt();
		System.out.println("Enter end number:");
		end = sc.nextInt();

		System.out.println("Prime number between " + start + " and " + end + "is:");
		for (i = start; i < end; i++) {
			count = 0;
			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}

		}

	}

}
