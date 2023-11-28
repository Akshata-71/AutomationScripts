package com.xyz.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.xyzbank.pom.AddCustomerPage;
import com.xyzbank.pom.BaseClass;
import com.xyzbank.pom.CustomerPage;
import com.xyzbank.pom.LoginPage;
import com.xyzbank.pom.ManagerPage;

public class TestScript01 extends BaseClass {

	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPage lp = new LoginPage(driver);
		lp.clickOnCustomerLogin();
		
		
		CustomerPage cp = new CustomerPage(driver);
		cp.enterName();
		cp.cliclOnLogin();
		cp.clickOnHome();
		
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.clickOnManagerLogin();
		
		ManagerPage mp = new ManagerPage(driver);
		mp.clickOnAddCustomer();
		
		AddCustomerPage acp  = new AddCustomerPage(driver);
		acp.enterDetails();
		
		
	}
}
