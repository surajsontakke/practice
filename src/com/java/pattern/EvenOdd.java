package com.java.pattern;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		num=scan.nextInt();
		if(num%2==0) {
			System.out.println("This is  Even Number");
		}
		else {
			System.out.println("This is  Even Odd Number");
		}

	}

}
