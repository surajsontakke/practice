package com.java.orcale;

public class NoChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a,b;
		for(a=1,b=2;b<a;a++,b--)
		for(int x:num) {
			System.out.print(x+" ");
			x=x*10; // no change
		}
		System.out.println();
		for(int x:num) {
			System.out.print(x+" ");
			
		}
		System.out.println();
	}

}
