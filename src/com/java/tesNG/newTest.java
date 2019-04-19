package com.java.tesNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class newTest {
  @Test(priority=1)
  public void adduser() {
	  System.out.println("Insert the user details");
  }
  @Test(priority=2)
  public void addcustomer(){
	  System.out.println("Add customer details");
  }
  @Test(priority=3)
  public void addproduct() {
	  System.out.println("Add product details");
	  Assert.assertEquals("Testing","Testing");
  }
}

