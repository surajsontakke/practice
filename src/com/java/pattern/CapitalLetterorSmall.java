package com.java.pattern;

import java.util.Scanner;

public class CapitalLetterorSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a char:");
		ch=scan.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println(ch + " is a Alphaet.");
		}
		else
		{
			System.out.println(ch + " is a not alphabet");
		}

	}

}
