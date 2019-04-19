package com.java.pattern;

public class TrainglePlus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1;
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=k;j++) {
				System.out.print("*");
			}
			k=k+2;
			System.out.println();
		}

	}

}
