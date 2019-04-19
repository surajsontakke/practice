package com.java.pattern;

import java.util.Scanner;

public class Scannerif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter 10:");
		num=scan.nextInt();
		if(num==10) {
			System.out.println("good");
		}
		else {
			System.out.println("Bad");
		}

	}

}
