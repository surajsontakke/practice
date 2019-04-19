package com.java.pattern;

import java.util.Scanner;

public class StarUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter row:");
		row = scan.nextInt();

		if (row <= 50) {

			for (int i = 1; i <= row; i++) {

				for (int j = 1; j <= (row - i); j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (i * 2 - 1); k++) {
					System.out.print("*");
				}

				System.out.println();

			}
		} else {
			System.out.println("Print less than 50");
		}
	}

}
