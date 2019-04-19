package com.java.test;

import java.util.Scanner;

public class BillCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double meal;
		double tax;
		double tip;
		double totalcost;
		double totalbill;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter cost of meal:");
		meal = scan.nextDouble();

		tax = 0.067 * meal;
		totalcost = meal + tax;
		tip = 0.20 * totalcost;
		totalbill = totalcost + tip;
		//output
		System.out.println("cost of mill: " + meal + "$");
		System.out.println("Tax : " + tax + "$");
		System.out.println("Totalcost : " + totalcost + "$");
		System.out.println("Tip : " + tip + "$");
		System.out.println("Totalbill : " + totalbill + "$");

	}

}
