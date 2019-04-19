package com.java.pattern;

import java.util.Scanner;

public class AvgusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3;
		double sum,avg;
		System.out.println("Enter any three number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		System.out.println("You entered "+ num1+","+ num2+ " and " +num3);
		System.out.println("Sum of all these three numbers");
		sum=num1+num2+num3;
		System.out.println("Sum:"+ sum);
		avg=sum/3;
		System.out.println("Avg:"+ avg);
	}

}
