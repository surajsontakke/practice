package com.java.tesNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSession {

	@Test
	public void FirstBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 1");
	}
	
	@Test
	public void secondBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 2");
	}

	@Test
	public void ThirdBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 3");
	}
}
