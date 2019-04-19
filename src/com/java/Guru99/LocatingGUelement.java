package com.java.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingGUelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl="https://www.facebook.com/";
		String tagname="";
		System.out.println("Testing the smaple code for git");
		
		driver.get(baseUrl);
		tagname=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagname);
		driver.close();
		System.exit(0);

	}

}
