package com.java.tesNG;

import org.testng.annotations.Test;

public class TestNGPriorityAnnotation {
	@Test
	public void c_method() {
		System.out.println("I am in c method");
	}

	@Test
	public void d_method() {
		System.out.println("I am in d method");
	}

	@Test
	public void e_method() {
		System.out.println("I am in e method");
	}

	@Test
	public void a_method() {
		System.out.println("I am in a method");
	}

	@Test
	public void b_method() {
		System.out.println("I am in b method");
	}

	@Test
	public void f_method() {
		System.out.println("I am in f method");
	}

}
