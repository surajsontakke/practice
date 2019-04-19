package com.java.test;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[] = new int[5];
		int i;
		float avg, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark obtained in 5 subject:");

		for (i = 0; i < 5; i++) {
			mark[i] = sc.nextInt();
			sum = sum + mark[i];
		}
		avg = sum / 5;
		System.out.println("Your grade is"  + avg);
		if (avg > 80) {
			System.out.println("A");
		} else if (avg > 60 && avg <= 80) {
			System.out.println("B");
		} else if (avg > 40 && avg <= 60) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}

}
