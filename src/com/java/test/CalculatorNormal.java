package com.java.test;

import java.util.Scanner;

public class CalculatorNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double fnum, snum, avrange;
		System.out.println("Enter first number : ");
		fnum = scan.nextDouble();
		System.out.println("Enter second number :");
		snum = scan.nextDouble();
		avrange = fnum + snum;
		System.out.println("Avrage :" + avrange);

	}

}
