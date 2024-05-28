package com.selenium;
import org.openqa.selenium.edge.*;

public class edge {

	public static void main(String[] args) {
			System.setProperty("Webdriver.Edge.driver", "Driver\\masedgedriver.exe");
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.google.co.in/");


	}

}
