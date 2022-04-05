package com.Flush.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flush.PageObjects.Gamepage;
import com.Flush.PageObjects.Homepage;
import com.Flush.PageObjects.WelcomePopup;
import com.Flush.Utilities.BaseClass;

public class HomePageWithoutLoginTestcases extends BaseClass {
	public WebDriver driver;

	public WebDriverWait wait;

	@BeforeMethod
	public void Initialization() throws IOException {
		driver = Setup();
		driver.get(baseURL);
	}

	@Test(enabled=true, priority=1)
	public void CrashGame() throws IOException {
		
		wait = new WebDriverWait(driver, 50);

		Homepage page = new Homepage(driver);

		page.Scroll(driver);

		Homepage.Crash(driver).click();
		
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='BET (NEXT ROUND)']")));
			
			Gamepage.BetButton(driver).click();
		}
		
		catch (Exception E)
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='BET'])[1]")));
			
			Gamepage.CrashBetNextroungButton(driver).click();
		}


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Play Now']")));

	}

	@Test(enabled=true, priority=1)
	public void DiceGame() throws IOException {
		
		wait = new WebDriverWait(driver, 50);

		Homepage page = new Homepage(driver);

		page.Scroll(driver);

		Homepage.DiceGame(driver).click();

		Gamepage.BetButton(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Play Now']")));

	}

	@Test(enabled=true, priority=1)
	public void MinesGame() throws IOException {
		
		wait = new WebDriverWait(driver, 50);

		Homepage page = new Homepage(driver);

		page.Scroll(driver);

		Homepage.Mines(driver).click();

		Gamepage.BetButton(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Play Now']")));

	}

	@Test(enabled=true, priority=1)
	public void WheelGame() throws IOException {
		
		wait = new WebDriverWait(driver, 50);

		Homepage page = new Homepage(driver);

		page.Scroll(driver);

		Homepage.Wheel(driver).click();

		Gamepage.BetButton(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Play Now']")));

	}

	@Test(enabled=true, priority=1)
	public void HiloGame() throws IOException, InterruptedException {
		
		wait = new WebDriverWait(driver, 50);

		Homepage page = new Homepage(driver);

		page.Scroll(driver);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='HiLo'])[1]")));

		Homepage.Hilo(driver).click();
		
		Thread.sleep(3000);

		Gamepage.HiloBetButton(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Play Now']")));

	}
}
