package com.java.pattern;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n1,n2,sum;
		System.out.println("Enter number:");
		n1=scan.nextInt();
		n2=scan.nextInt();
		sum=n1+n2;
		System.out.println("Sum:" + sum);

	}

}
