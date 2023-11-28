package com.xyzbank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	@FindBy(xpath = ".//input[@placeholder=\"First Name\"]")
	private WebElement fname;
	
	@FindBy(xpath = ".//input[@placeholder=\"Last Name\"]")
	private WebElement lname;
	
	@FindBy(xpath = ".//input[@placeholder=\"Post Code\"]")
	private WebElement code;
	
	@FindBy(xpath = ".//button[text()=\"Add Customer\"]")
	private WebElement addcustomerbutton;
	
	public AddCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails() {
		fname.sendKeys("Akshata");
		lname.sendKeys("Bhonde");
		code.sendKeys("411013");
		addcustomerbutton.click();
	}
}
