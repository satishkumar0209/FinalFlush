package com.Flush.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flush.PageObjects.DashboardPage;
import com.Flush.PageObjects.Homepage;
import com.Flush.PageObjects.VIP;
import com.Flush.PageObjects.WelcomePopup;
import com.Flush.Utilities.BaseClass;

public class VipTestcases extends BaseClass {
	public WebDriver driver;

	public Homepage homepage;

	public WebDriverWait wait;

	@BeforeMethod
	public void Initialization() throws IOException {
		driver = Setup();
		driver.get(baseURL);
	}

	@Test(enabled = false)
	public void CheckingHeaderLoyalityText() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//FlushProperties//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		log.info("Login button clicked successfully");

		WelcomePopup.Welcomeemail(driver).sendKeys("satishkumar@rapidinnovation.dev");

		log.info("Email entered successfully");

		WelcomePopup.Welcomepassword(driver).sendKeys("Satvik@123");

		log.info("Password Entered successfully");

		WelcomePopup.Welcomeplaynow(driver).click();

		log.info("PlayNow button clicked successfully");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));

		log.info("Wallet button visible");

		DashboardPage.Userdropdown(driver).click();

		log.info("Dropdown button clicked successfully");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("VIPdropdown"))));

		VIP.DropdownVipLink(driver);

		log.info("Loyality link clicked successfully");

		VIP.DropdownVipLink(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Loyality"))));

		log.info("Loyality Header text  visible successfully");

	}

	@Test(enabled = false)
	public void CheckingVippagTabs() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//FlushProperties//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		log.info("Login button clicked successfully");

		WelcomePopup.Welcomeemail(driver).sendKeys("satishkumar@rapidinnovation.dev");

		log.info("Email entered successfully");

		WelcomePopup.Welcomepassword(driver).sendKeys("Satvik@123");

		log.info("Password Entered successfully");

		WelcomePopup.Welcomeplaynow(driver).click();

		log.info("PlayNow button clicked successfully");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));

		log.info("Wallet button visible");

		DashboardPage.Userdropdown(driver).click();

		log.info("Dropdown button clicked successfully");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("VIPdropdown"))));

		VIP.DropdownVipLink(driver);

		log.info("Loyality link clicked successfully");

		VIP.DropdownVipLink(driver).click();
		
		log.info("Vip link clicked successfully");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Rewards = VIP.Rewards(driver);

		js.executeScript("arguments[0].scrollIntoView();", Rewards);
		
		log.info("Scrolled to Rewards Text");

		VIP.ClaimRewardstab(driver).click();

		VIP.Rewards(driver).click();
		
		VIP.ClaimRewardstab(driver).click();

	}
}
