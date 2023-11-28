package com.xyzbank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void openApp() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}
	
	public void closeApp() {
		driver.close();
	}
	
	
}
