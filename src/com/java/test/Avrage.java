package com.java.test;

import java.util.Scanner;

public class Avrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double FirstScore;
		double secondScore;
		double thirdScore;

		double avrage;

		Scanner scan = new Scanner(System.in);

		System.out.println("PLease enter firstScore : ");
		FirstScore = scan.nextDouble();
		System.out.println("PLease enter secondscore: ");
		secondScore = scan.nextDouble();
		System.out.println("PLease enter thirdscore: ");
		thirdScore = scan.nextDouble();

		avrage = (FirstScore + secondScore + thirdScore) / 3;
		System.out.println("The avrage of " + FirstScore + "," + secondScore + "and " + thirdScore + " is :" + avrage);

	}

}
