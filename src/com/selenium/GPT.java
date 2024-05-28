package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GPT {

	public static void main(String[] args) {
		System.setProperty("Webdriver.cromedriver.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
		driver.manage().window().maximize();
	    //WebElement username = driver.findElement(By.className("antialiased"));
	
		driver.findElement(By.name("radix-:r7:")).click();
		
		WebElement username1 = driver.findElement(By.id("prompt-textarea"));
		username1.sendKeys("Perform the selenieum on email loggin functinality");
		username1.submit();

	}

}

