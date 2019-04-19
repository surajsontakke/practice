package com.java.pattern;

public class Peramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5, SpaceCounter = 4, StarCounter = 1;
		for (int i = 1; i <= row; i++) {
			System.out.println();

			for (int j = 1; j <= SpaceCounter; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= StarCounter; k++) {
				System.out.print("*");
			}
			SpaceCounter--;
			StarCounter=StarCounter+2;
		}
	}

}
