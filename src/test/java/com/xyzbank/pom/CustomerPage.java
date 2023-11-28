package com.xyzbank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {

	@FindBy(id="userSelect")
	private WebElement customername;
	
	@FindBy(xpath=".//button[text()=\"Login\"]")
	private WebElement loginbutton;
	
	@FindBy(xpath = ".//button[text()=\"Home\"]")
	private WebElement homebutton;
	
	
	public CustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterName() {
		Select s = new Select(customername);
		s.selectByValue("2");
	}
	
	public void cliclOnLogin() {
		loginbutton.click();
	}
	
	public void clickOnHome() {
		homebutton.click();
	}
	
}
