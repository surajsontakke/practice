package com.java.test;

import java.util.Scanner;

public class TableofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num, tab;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		System.out.println("Table of :" + num);
		for (i = 1; i <= 10; i++) {
			tab = num * i;
			System.out.println(num + "*" + i + "=" + tab);
		}
	}

}
