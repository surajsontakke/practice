package com.java.tesNG;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test(priority = 1)
	public void addclient() {
		System.out.println("Update the client details");
	}

	@Test(priority = 2)
	public void addSales() {
		System.out.println("Update the sales details");
	}

}
