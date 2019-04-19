package com.java.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://www.facebook.com/";
		String tagname,tagname2;
		driver.get(baseurl);
		tagname=driver.findElement(By.id("email")).getTagName();
		tagname2=driver.findElement(By.id("pass")).getTagName();
		System.out.println(tagname);
		System.out.println(tagname2);
		driver.close();
		System.exit(0);
	}

}
