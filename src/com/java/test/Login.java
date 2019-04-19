package com.java.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.get("www.google.com");
		String url = "http://softwaretestingmaterial.com";
		 String expectedTitle = "Software Testing Material - A site for Software Testers";
		 String actualTitle = null;
		 
		 //To oepn URL "http://softwaretestingmaterial.com". This is what we have assigned to the variable named 'url'.
		 driver.get(url);
		 //To get the actual value of the title. getTitle method used to get the page title
		 actualTitle = driver.getTitle();
		 //Using if-else condition to compare the Expected Title and Actual Title. As per the below lines of code (if-else condition).
		 if (actualTitle.contentEquals(expectedTitle)){
		 //'system.out.println' prints the output
		 System.out.println("Expected Value is "+expectedTitle);
		 System.out.println("Actual Value is "+actualTitle);
		 System.out.println("Test Passed");
		 } else {
		 System.out.println("Expected Value is "+expectedTitle);
		 System.out.println("Actual Value is "+actualTitle);
		 System.out.println("Test Failed");
		 }
		 //'close' method is used to close the browser window
		 driver.close();
		 //To run the script - Go to menu bar - click on Run - Run or use shortcut key Ctrl+F11
		 //You could see the output in the console as shown below:
		 //Expected Value is Software Testing Material - A site for Software Testers
		 //Actual Value is Software Testing Material - A site for Software Testers
		 //Test Passed
		 }
		}
		

