package com.java.tesNG;

import org.testng.annotations.Test;

public class PriorityAnnotation {

	@Test(priority = 4)
	public void CMethod() {
		System.out.println("I'm in c method");
	}

	@Test(priority = 4)
	public void DMethod() {
		System.out.println("I'm in D method");
	}

	@Test(priority = 7)
	public void AMethod() {
		System.out.println("I'm in A method");
	}

	@Test(priority = 0)
	public void ZMethod() {
		System.out.println("I'm in Z method");
	}

	@Test(priority = 3)
	public void NMethod() {
		System.out.println("I'm in N method");
	}

	@Test(priority = 1)
	public void BMethod() {
		System.out.println("I'm in B method");
	}

}
