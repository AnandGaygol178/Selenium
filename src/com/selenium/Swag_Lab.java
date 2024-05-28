package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Lab {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.cromedriver.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//login.click();
		
		Thread.sleep(1000);
	    
	       String currentwindowHandle = driver.getWindowHandle();
	       driver.switchTo().window(currentwindowHandle);
	       
	       driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
	       Thread.sleep(1000);
	       
	       String currentwindowHandle1 = driver.getWindowHandle();
	       driver.switchTo().window(currentwindowHandle1);
	       
	       driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();


		 
	}

}
