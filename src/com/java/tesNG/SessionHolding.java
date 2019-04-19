package com.java.tesNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SessionHolding {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/");
		
		WebDriver driver2 = new ChromeDriver();

		driver2.get("http://demo.guru99.com/V4/");

	}
}
