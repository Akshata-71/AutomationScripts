package com.xyzbank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {
	@FindBy(xpath=".//button[text()=\"Add Customer\r\n"
			+ "		\"]")
	private WebElement addcustomer;
	
	@FindBy(xpath=".//button[2]")
	private WebElement openAccount;
	
	@FindBy(xpath=".//button[3]")
	private WebElement customers;
	
	public ManagerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  void clickOnAddCustomer() {
		addcustomer.click();
	}
	
	public void clickOnOpenAccount() {
		openAccount.click();
	}
	
	public void clickOnCustomer() {
		customers.click();
	}

}
