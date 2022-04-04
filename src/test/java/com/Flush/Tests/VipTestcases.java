package com.Flush.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flush.PageObjects.AccountDropdown;
import com.Flush.PageObjects.DashboardPage;
import com.Flush.PageObjects.DiceGamePage;
import com.Flush.PageObjects.Homepage;
import com.Flush.PageObjects.VIPPage;
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

		VIPPage.DropdownVipLink(driver);

		log.info("Loyality link clicked successfully");

		VIPPage.DropdownVipLink(driver).click();

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

		VIPPage.DropdownVipLink(driver);

		log.info("Loyality link clicked successfully");

		VIPPage.DropdownVipLink(driver).click();

		log.info("VIPPage link clicked successfully");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Rewards = VIPPage.Rewards(driver);

		js.executeScript("arguments[0].scrollIntoView();", Rewards);

		log.info("Scrolled to Rewards Text");

		VIPPage.ClaimRewardstab(driver).click();

		VIPPage.Rewards(driver).click();

		VIPPage.ClaimRewardstab(driver).click();

	}

	@Test(enabled = false)
	public void ClaimRewards() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//FlushProperties//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		log.info("Login button clicked successfully");

		Homepage page = new Homepage(driver);

		page.Login(driver);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));

		Homepage.WalletBalanceDropdown(driver).click();

		Homepage.WalletBalanceDropdownBTC(driver).click();

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		WebElement Amount = DiceGamePage.BetAmountinputField(driver);

		Amount.clear();

		Amount.sendKeys("0.00021");

		DiceGamePage.BetButton(driver).click();

		DashboardPage.Userdropdown(driver).click();

		AccountDropdown.VIP(driver).click();

		WebElement TotalPoints = VIPPage.TotalPointsSection(driver);

		String Points = TotalPoints.getAttribute("innerText");

		System.out.println("Total points " + Points);

		String str = Points;

		String VisiblePoints = StringUtils.remove(str, "TOTAL POINTS");

		String spacesremove = VisiblePoints.replaceAll("\\s", "");

		System.out.println(VisiblePoints);

		int i = Integer.parseInt(spacesremove);

		if (i > 500) {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement Claimrewards = VIPPage.ClaimRewardsButton(driver);

			js.executeScript("arguments[0].scrollIntoView();", Claimrewards);

			Claimrewards.click();

			WebElement ChooseYourRewardCancelButton = VIPPage.ClaimRewardsChooseYourRewardCancelbutton(driver);

			ChooseYourRewardCancelButton.click();

		} else {

			System.out.println("Less than 500");

		}

	}

	@Test(enabled = false)
	public void ChooseYourPasswordRadioButtonOne() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//FlushProperties//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		log.info("Login button clicked successfully");

		Homepage page = new Homepage(driver);

		page.Login(driver);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));

		Homepage.WalletBalanceDropdown(driver).click();

		Homepage.WalletBalanceDropdownBTC(driver).click();

		DashboardPage.Userdropdown(driver).click();

		AccountDropdown.VIP(driver).click();

		WebElement TotalPoints = VIPPage.TotalPointsSection(driver);

		String Points = TotalPoints.getAttribute("innerText");

		System.out.println("Total points " + Points);

		String str = Points;

		String VisiblePoints = StringUtils.remove(str, "TOTAL POINTS");

		String spacesremove = VisiblePoints.replaceAll("\\s", "");

		System.out.println(VisiblePoints);

		int i = Integer.parseInt(spacesremove);

		if (i > 500) {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement Claimrewards = VIPPage.ClaimRewardsButton(driver);

			js.executeScript("arguments[0].scrollIntoView();", Claimrewards);

			Claimrewards.click();

			WebElement ChooseYourRewardCancelButton = VIPPage.ClaimRewardsChooseYourRewardCancelbutton(driver);

			VIPPage.ClaimRewardsChooseYourRewardFirstRadio(driver).click();

		} else {

			System.out.println("Less than 500");

		}

	}

	@Test(enabled = true)
	public void ChooseYourPasswordSecondRadioButton() throws IOException, InterruptedException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//FlushProperties//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		log.info("Login button clicked successfully");

		Homepage page = new Homepage(driver);

		page.Login(driver);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));

		Homepage.WalletBalanceDropdown(driver).click();

		Homepage.WalletBalanceDropdownBTC(driver).click();

//		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");
//
//		WebElement Amount = DiceGamePage.BetAmountinputField(driver);
//
//		Amount.clear();
//
//		Amount.sendKeys("0.00021");

//		DiceGamePage.BetButton(driver).click();

		DashboardPage.Userdropdown(driver).click();

		AccountDropdown.VIP(driver).click();

		WebElement TotalPoints = VIPPage.TotalPointsSection(driver);

		String Points = TotalPoints.getAttribute("innerText");

		System.out.println("Total points " + Points);

		String str = Points;

		String VisiblePoints = StringUtils.remove(str, "TOTAL POINTS");

		String spacesremove = VisiblePoints.replaceAll("\\s", "");

		System.out.println(VisiblePoints);

		int i = Integer.parseInt(spacesremove);
		
		

		while (i <= 723) {

			driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

			Thread.sleep(5000);

			WebElement Amount = DiceGamePage.BetAmountinputField(driver);
			
			Amount.sendKeys(Keys.CONTROL, "a");
			
			Amount.sendKeys(Keys.DELETE);
			

			Amount.sendKeys("0.00021");

			DiceGamePage.BetButton(driver).click();

			Thread.sleep(5000);

			driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/vip");

			Thread.sleep(5000);

			WebElement TotalPoints1 = VIPPage.TotalPointsSection(driver);

			String Points1 = TotalPoints1.getAttribute("innerText");

			System.out.println("Total points " + Points1);

			String str1 = Points1;

			String VisiblePoints1 = StringUtils.remove(str1, "TOTAL POINTS");

			String spacesremove1 = VisiblePoints1.replaceAll("\\s", "");

			System.out.println(VisiblePoints1);

			int i1 = Integer.parseInt(spacesremove1);
			
			System.out.println("========="+i1);
			
			i=i1;

		}
		
		System.out.println("Final value "+ i );
		
		
//		if (i > 500) {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//
//			WebElement Claimrewards = VIPPage.ClaimRewardsButton(driver);
//
//			js.executeScript("arguments[0].scrollIntoView();", Claimrewards);
//
//			Claimrewards.click();
//
//			WebElement ChooseYourRewardCancelButton = VIPPage.ClaimRewardsChooseYourRewardCancelbutton(driver);
//
//			VIPPage.ClaimRewardsChooseYourRewardSecondRadio(driver).click();
//
//		} else {
//
//			System.out.println("Less than 500");
//
//		}

	}

}
