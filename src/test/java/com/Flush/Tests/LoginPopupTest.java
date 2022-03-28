package com.Flush.Tests;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Flush.PageObjects.LoginPopup;
import com.Flush.Utilities.BaseClass;


public class LoginPopupTest extends BaseClass{
	WebDriver driver;
	LoginPopup login_Popup;


	@BeforeMethod
	public void Initialization() throws IOException 
	{
		driver = Setup();
		
		driver.get(baseURL);
		
		log.info("URL launched");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//TestCase1 >> Valid User name & valid password
	@Test(enabled = false, priority = 1)
	public void TC_021()  
	{	

		login_Popup = new LoginPopup(driver);
		
		login_Popup.Login().click();
		
		login_Popup.EmailOrUsername().sendKeys(username1);
		
		log.info("entered valid username");      

		login_Popup.Password().sendKeys(password1);

		log.info("entered valid password");

		login_Popup.PlayNow().click();

		log.info("clicked on Play Now");
		
		WebDriverWait wt = new WebDriverWait(driver,10);
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='path'][@fill='currentColor'])[2]")));

		if(login_Popup.UserPath().isDisplayed())
		{

			Assert.assertTrue(false);
			
			log.info("Login test passed");
		} 
		else {
		
			Assert.assertTrue(false);
			
			log.warn("Login test failed");
		}
	}

	//TestCase2 >> Valid user name & Invalid password
	@Test(enabled = false, priority = 1)
	public void TC_022()
	{
		login_Popup = new LoginPopup(driver);

		login_Popup.Login().click();
		
		login_Popup.EmailOrUsername().sendKeys(username2);

		log.info("entered valid username");

		login_Popup.Password().sendKeys(password2);

		log.info("entered invalid password");

		login_Popup.PlayNow().click();

		log.info("clicked on Play Now");
		
		WebDriverWait wt = new WebDriverWait(driver,5);

		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='error']")));

		if(login_Popup.Error().isDisplayed())
		{
			Assert.assertTrue(false);
			log.info("Login test failed");
		} else {
			Assert.assertTrue(false);
			log.info("Login test passed");
		}
	}

	//TestCase3 >> InValid user name & valid password
	@Test(enabled = false, priority = 1)
	public void TC_023()
	{
		login_Popup = new LoginPopup(driver);
		login_Popup.Login().click();
		
		login_Popup.EmailOrUsername().sendKeys(username3);
		log.info("entered Invalid username");

		login_Popup.Password().sendKeys(password3);
		log.info("entered valid password");

		login_Popup.PlayNow().click();
		log.info("clicked on Play Now");
		WebDriverWait wt = new WebDriverWait(driver,5);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='error']")));

		if(login_Popup.Error().isDisplayed())
		{
			Assert.assertTrue(false);
			log.info("Login test failed");
		} else {
			Assert.assertTrue(false);
			log.info("Login test passed");
		}
	}

	//TestCase4 >> InValid user name & Invalid password
	@Test(enabled = false, priority = 1)
	public void TC_024()
	{
		login_Popup = new LoginPopup(driver);
		login_Popup.Login().click();
		
		login_Popup.EmailOrUsername().sendKeys(username4);
		log.info("entered invalid username");

		login_Popup.Password().sendKeys(password4);
		log.info("entered invalid password");

		login_Popup.PlayNow().click();
		log.info("clicked on Play Now");
		WebDriverWait wt = new WebDriverWait(driver,5);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='error']")));

		if(login_Popup.Error().isDisplayed())
		{
			Assert.assertTrue(false);
			log.info("Login test failed");
		} else {
			Assert.assertTrue(false);
			log.info("Login test passed");
		}
	}

	@AfterMethod
	public void EndTest() throws IOException 
	{
		driver = teardown();
	}



}
