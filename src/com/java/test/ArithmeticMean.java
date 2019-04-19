package com.java.test;

import java.util.Scanner;

public class ArithmeticMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, sum = 0;
		double armean;
		int arr[] = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to enter:");
		n = sc.nextInt();
		System.out.println("Enter " + n + " Number:");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];

		}
		armean = sum / n;
		System.out.println("Arithmatical mean =" + armean);

	}

}
