package com.java.tesNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class TakeScreenshot {

	@Test
	public void CaptureScreeshot() {
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.youtube.com");

		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
		   // now copy the  screenshot to desired location using copyFile method
		  
		  FileUtils.copyFile(src, new File("/home/suraj/Desktop/suraj"+System.currentTimeMillis()+".png"));
		        }
		  
		 catch (IOException e)
		  
		 {
		  
		 System.out.println(e.getMessage());
		  
		     }

	}

}
