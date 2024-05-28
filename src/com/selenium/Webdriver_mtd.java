package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_mtd {

	public static void main(String[] args) {
		System.setProperty("Webdriver.cromedriver.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String text1=driver.getTitle();
		System.out.println("return title of webpage"+text1);
		String text2=driver.getCurrentUrl();
		System.out.println("return url of webpage "+text2);
		//String text3=driver.getPageSource();
		//System.out.println("return page source of web page "+text3);
		
		driver.navigate();
		
		

	}

}
