package com.java.pattern;

import java.util.Scanner;

public class CheckforVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		ch=scan.next().charAt(0);
		
		 if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			 System.out.println("This is vowel");
		 }else
		 {
			 System.out.println("this is not vowel");
		 }

	}

}
