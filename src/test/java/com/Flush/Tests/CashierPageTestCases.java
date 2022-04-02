package com.Flush.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flush.PageObjects.Homepage;
import com.Flush.Utilities.BaseClass;

public class CashierPageTestCases extends BaseClass{
	

	public WebDriver driver;

	public Homepage homepage;

	public WebDriverWait wait;

	@BeforeMethod
	public void Initialization() throws IOException {
		driver = Setup();
		driver.get(baseURL);
	}

	@Test(enabled = false, priority = 1)
	public void LoginAsValidUser() throws IOException {
		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();
		
		
		page.Login(driver);
		
	
		
		
		
	}
	}
