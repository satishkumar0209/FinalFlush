package com.Flush.Tests;

import java.io.IOException;
import java.math.BigDecimal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

	@Test(enabled = false, priority = 1)
	public void DiceGameBetFullFlowchecking() throws IOException, InterruptedException {

		Homepage page = new Homepage(driver);

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		page.Login(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement OriginalsHeader = Homepage.FlushOriginalsHeader(driver);
		
		

		js.executeScript("arguments[0].scrollIntoView();", OriginalsHeader);
		
		log.info("Scrolling up to original headers");

		Thread.sleep(4000);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/games/dice");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Dice'])[1]")));

		// Homepage.DiceGame(driver).click();

		WebElement Walletbalance = Homepage.WalletBalanceDropdown(driver);

		String Totalmoney = Walletbalance.getAttribute("innerText");
		
		log.info("Getting wallet baalnce successfully ");

		double WalletAmount = new Double(Totalmoney);
		
		log.info("String value converting into decimal");

		BigDecimal DashboardWalletAmount = BigDecimal.valueOf(WalletAmount);

		System.out.println("Total Amount in you wallet =  " + DashboardWalletAmount);

		WebElement Amount = DiceGamePage.BetAmountinputField(driver);

		Amount.sendKeys(Keys.CONTROL, "a");
		
		log.info("Selecting all default amount successfully");

		Amount.sendKeys(Keys.DELETE);
		
		log.info("Deleted default amount successfully");

		Amount.sendKeys("0.0000100");
		
		log.info("Entering some amount successfully");

		Double BetAmount = 0.0000100;

		DiceGamePage.BetButton(driver).click();
		
		log.info("Bet button clicked successfully");

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='PastBetButton__PastBetButtonWrapper-sc-pe28g7-0 joejdF']")));
		
		log.info("Checking dice value");

		WebElement DiceResultNumber = DiceGamePage.LatestResultDiceGame(driver);

		String Dicenumber = DiceResultNumber.getAttribute("innerText");
		
		log.info("Getting dice number successfully through string format");
		

		System.out.println("Dice break number  =" + Dicenumber);

		double checkdice = Double.parseDouble(Dicenumber);
		
		log.info("Converting string dice number in to number successfully");

		if (checkdice > 50) {

			System.out.println("User Win the Dice game ");

			double Balanceamount = (WalletAmount + BetAmount);

			// System.out.println("Dice Game Win after total Amount in you wallet = " +
			// Balanceamount);

			String s1 = String.format("%.8f", Balanceamount);

			System.out.println("Dice Game Win after total Amount in you wallet = " + s1);

			WebElement Walletbalance1 = Homepage.WalletBalanceDropdown(driver);

			String Totalmoney1 = Walletbalance1.getAttribute("innerText");

//			System.out.println("Getting calculation ouptput "+ s1);
//			
//			System.out.println("Getting dashboard amount "+ Totalmoney1);

			Assert.assertEquals(s1, Totalmoney1);

			System.out.println("Test case pass");

		} else {
			System.out.println("User Loss the Dice game ");

			double Balanceamount = (WalletAmount - BetAmount);

			// System.out.println("Dice Game Loss after total Amount in you wallet = " +
			// Balanceamount);

			String s2 = String.format("%.8f", Balanceamount);

			System.out.println("Dice Game Loss after total Amount in you wallet = " + s2);

			WebElement Walletbalance2 = Homepage.WalletBalanceDropdown(driver);

			String Totalmoney2 = Walletbalance2.getAttribute("innerText");

//			System.out.println("Getting calculation ouptput "+ s2);
//			
//			System.out.println("Getting dashboard amount "+ Totalmoney2);

			Assert.assertEquals(s2, Totalmoney2);

			System.out.println("Test case pass");
		}
		WebElement statics = DiceGamePage.MyBets(driver);

		js.executeScript("arguments[0].scrollIntoView();", statics);

		DiceGamePage.MyBets(driver).click();

		DiceGamePage.MyBetsLatestDice(driver).click();

		DiceGamePage.BetPopup(driver).click();

		Thread.sleep(4000);

		// Getting first server seed

		WebElement Activeserverseed = DiceGamePage.FAIRNESSActiveserverseed(driver);

		String Serverseed = Activeserverseed.getAttribute("value");

		System.out.println("Server seed=  " + Serverseed);

		// Getting Next server Seed

		WebElement Nextserverseed = DiceGamePage.FAIRNESSNextserverseed(driver);

		String ServerseedNext = Nextserverseed.getAttribute("value");

		System.out.println("Next server seed =  " + ServerseedNext);

		// Click on changing button

		DiceGamePage.FAIRNESSChangeButton(driver).click();

		// After changing the server seed getting

		WebElement Activeserverseed1 = DiceGamePage.FAIRNESSActiveserverseed(driver);

		String Serverseed1 = Activeserverseed1.getAttribute("value");

		System.out.println("Latest Active seed =  " + Serverseed1);

		Assert.assertEquals(ServerseedNext, Serverseed1);

		// Assertion pending

		// System.out.println("Next = " + Nextserverseed);

	}

	@Test(enabled = true, priority = 1)
	public void HalfAmount() throws IOException, InterruptedException {

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

		WebElement Walletbalance = Homepage.WalletBalanceDropdown(driver);

		String Totalmoney = Walletbalance.getAttribute("innerText");

		double WalletAmount = new Double(Totalmoney);

		BigDecimal DashboardWalletAmount = BigDecimal.valueOf(WalletAmount);

		System.out.println("Total Amount in you wallet =  " + DashboardWalletAmount);

		WebElement Amount = DiceGamePage.BetAmountinputField(driver);

		Amount.sendKeys(Keys.CONTROL, "a");

		Amount.sendKeys(Keys.DELETE);

		Amount.sendKeys("0.00000100");

		Double BetAmount = 0.00000100;

		DiceGamePage.HalfAmount(driver).click();

		DiceGamePage.BetButton(driver).click();

		WebElement ProfitOnWin = DiceGamePage.ProfitOnWinInputBox(driver);

		String WinProfit = ProfitOnWin.getAttribute("value");

		System.out.println("=============" + WinProfit);

		//BigDecimal num = new BigDecimal(WinProfit);
		
		//System.out.println("Converted String to BigDecimal : " + num);

		double str1 = Double.parseDouble(WinProfit);

		System.out.println("+++++++++++"+ str1);

		//BigDecimal OnWinProfit = BigDecimal.valueOf(num);

//		System.out.println("Profit on Win =" + OnWinProfit);
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
//		if (checkdice > 50) {
//
//			System.out.println("User Win the Dice game ");
//
//			double Balanceamount = (WalletAmount + BetAmount);
//
//			String s1 = String.format("%.8f", Balanceamount);
//
//			System.out.println("Dice Game Win after total Amount in you wallet = " + s1);
//
//			Double Value = (BetAmount - Profit);
//
//			System.out.println("Loss the game total amount is " + Value);
//
//		} else {
//			System.out.println("User Loss the Dice game ");
//
//			double Balanceamount = (WalletAmount - BetAmount);
//
//			// System.out.println("Dice Game Loss after total Amount in you wallet = " +
//			// Balanceamount);
//
//			String s2 = String.format("%.8f", Balanceamount);
//
//			System.out.println("Dice Game Loss after total Amount in you wallet = " + s2);
//
//			Double Value = (BetAmount - Profit);
//
//			System.out.println("Loss the game total amount is " + Value);
//		}

//			
//
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
