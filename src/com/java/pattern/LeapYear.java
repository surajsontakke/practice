package com.java.pattern;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year: ");
		year=scan.nextInt();
		if((year%4==0) && (year%100!=0)) {
			System.out.println("This is leap year");
		}
		else if((year%100==0) && (year%400==0)){
			System.out.println("This is leap year");
		}
		else if(year%400==0) {
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is  not leap year");
		}
	}

}
