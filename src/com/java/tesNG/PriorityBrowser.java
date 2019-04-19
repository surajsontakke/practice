package com.java.tesNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityBrowser {
	WebDriver driver;
	
	@Test (priority=1)
	public void openBrowser() {
		driver = new ChromeDriver();
	}
	
	@Test 
	public void launchgoogle() {
		driver.get("https://www.google.co.in");
	}

	@Test 
	public void performSearch() {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("facebook");
	}
	 
	@Test 
	public void facebookTitleVerification() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@value='Search']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("facebook - google search"), true);
		
	}
}
