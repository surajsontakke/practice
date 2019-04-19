package com.java.orcale;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int x : num) {
			System.out.println("value is: " + x);
			sum += x;
		}
		System.out.println("summation is:" + sum);
	}

}
