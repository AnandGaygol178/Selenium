package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Webelement {

	public static void main(String[] args) {
			System.setProperty("Webdriver.cromedriver.driver", "Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://github.com/login");
			driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.id("login_field"));
			username.sendKeys("gaygolanand2@gmail.com");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("@bjpWIN2024");
			
			driver.findElement(By.name("commit")).click();
		 
			//driver.get("https://github.com/AnandGaygol178");
			
			//driver.findElement(By.name("button")).click();
			//WebElement username2 = driver.findElement(By.id("user_profile_name"));
			//username2.sendKeys("AG178");
			//username2.submit();
			

			
	}

}
