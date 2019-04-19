package com.java.Guru99;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/suraj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		String Baseurl = "https://www.facebook.com/";
		/*
		 * driver.get(Baseurl); driver.manage().window().maximize(); WebElement email =
		 * driver.findElement(By.id("email"));
		 * 
		 * WebElement pass = driver.findElement(By.id("pass"));
		 * 
		 * email.sendKeys("suraj.sontakke52@yahoo.in"); pass.sendKeys("suraj@5152");
		 * 
		 * System.out.println("Text field set");
		 * 
		 * email.clear(); pass.clear();
		 * 
		 * System.out.println("Text field cleared.");
		 * 
		 * 
		 * 
		 * WebElement Login = driver.findElement(By.id("loginbutton"));
		 * 
		 * email.sendKeys("suraj.sontakke52@yahoo.in"); pass.sendKeys("suraj@5152");
		 * Login.click();
		 * 
		 * 
		 * System.out.println("login is done"); driver.close();
		 */
		driver.get(Baseurl);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("suraj.sontakke52@yahoo.in");
		driver.findElement(By.id("pass")).sendKeys("suraj@5152");
		driver.findElement(By.id("loginbutton")).submit();
		System.out.println("Login done with submitted.");
		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.ESCAPE).build().perform();
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		WebElement dropDown = driver.findElement(By.id("logoutMenu"));
		dropDown.click();

		WebDriverWait wait = new WebDriverWait(driver, 8);
		WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));

		logout.click();
		System.out.println("Log out successfully");
		driver.close();

	}

}
