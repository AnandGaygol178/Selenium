package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Setup {

	public static void main(String[] args) {
		System.setProperty("Webdriver.cromedriver.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://classroom.google.com/");
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fclassroom.google.com&ifkv=AaSxoQxKUMjt-kEiTq7XScDMAjW0OmKojvtDB49AUVJyHIVKpOO6K200dSRj_V0IN-txOF3IfQdH9Q&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1610356505%3A1715056289879994&theme=mn&ddm=0");
		


		driver.close();
		driver.quit();
		}

}
