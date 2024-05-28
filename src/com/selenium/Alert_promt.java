package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_promt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.cromedriver.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(500);
		Alert a=driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.sendKeys("**********Anand************");
		a.accept();
		driver.switchTo().defaultContent();
	}

}
