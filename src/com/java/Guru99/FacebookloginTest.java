package com.java.Guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookloginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://www.facebook.com/";
		//String expectedTitle = "Facebook-log in or sing up";
		String expectedTitle = "Facebook – log in or sign up";
		String title = "";
		driver.get(baseurl);
		title = driver.getTitle();
		System.out.println(title);

		if (title.contentEquals(expectedTitle)) {
			System.out.println("Test is passed.");
		} 
		else 
		{
			System.out.println("Test is failed.");
		}
		driver.close();
		System.exit(0);

	}

}
