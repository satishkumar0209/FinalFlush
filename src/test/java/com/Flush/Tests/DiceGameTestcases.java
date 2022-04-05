package com.Flush.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flush.PageObjects.DiceGamePage;
import com.Flush.PageObjects.Homepage;
import com.Flush.PageObjects.VIPPage;
import com.Flush.Utilities.BaseClass;

public class DiceGameTestcases extends BaseClass {

	public WebDriver driver;

	public Homepage homepage;

	public WebDriverWait wait;

	@BeforeMethod
	public void Initialization() throws IOException {
		driver = Setup();
		driver.get(baseURL);
	}

	@Test(enabled = true, priority = 1)
	public void DiceGameBet() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Dice'])[1]")));

		// Homepage.DiceGame(driver).click();
		
		
		WebElement Walletbalance=Homepage.WalletBalanceDropdown(driver);
		
		String Totalmoney = Walletbalance.getAttribute("innerText");
		
		System.out.println("=========="+Totalmoney);
		
		String walletmoney = Totalmoney;

		float f = Float.parseFloat(walletmoney);
		
		System.out.println("++++++++++++"+f);
//
//		System.out.println(String.format("%.8f", f));

//		WebElement Amount = DiceGamePage.BetAmountinputField(driver);
//
//		Amount.sendKeys(Keys.CONTROL, "a");
//		
//		Amount.sendKeys(Keys.DELETE);
//
//		Amount.sendKeys("0.000021");

//		DiceGamePage.BetButton(driver).click();
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//*[@class='PastBetButton__PastBetButtonWrapper-sc-pe28g7-0 joejdF']")));
//
//		WebElement DiceResultNumber = DiceGamePage.LatestResultDiceGame(driver);
//
//		String Dicenumber = DiceResultNumber.getAttribute("innerText");
//
//		System.out.println("Dice break number  =" + Dicenumber);
//
//		double checkdice = Double.parseDouble(Dicenumber);
//		
//		if(checkdice>50)
//		{
//			System.out.println("Dice game Win ");
//		}
//		else
//		{
//			System.out.println("Dice game Loss ");
//		}

	}

	@Test(enabled = false, priority = 1)
	public void DiceGameSetting() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		DiceGamePage.DiceGameSettingICon(driver).click();
	}

	@Test(enabled = false, priority = 1)
	public void DiceGameRules() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		DiceGamePage.DiceGameRulesICon(driver).click();

		DiceGamePage.DiceGameRulesCrossIcon(driver).click();
	}
	
	@Test(enabled = false, priority = 1)
	public void DiceGameLiveStatusButton() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		DiceGamePage.DiceGameLiveStatusIcon(driver).click();

	}
	
	@Test(enabled = false, priority = 1)
	public void DiceGameFairNessbutton() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		DiceGamePage.DiceGameFairnessIcon(driver).click();

	}
	
	@Test(enabled = false, priority = 1)
	public void DiceGameAutoButtonTab() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		DiceGamePage.DiceGameAutoButton(driver).click();

	}
	
	
}
