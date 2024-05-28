package com.selenium;
import org.openqa.selenium.firefox.*;
public class Gecko_driver {

	public static void main(String[] args) {
		System.setProperty("Webdriver.firefoxdriver","Driver//.geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
	}

}
