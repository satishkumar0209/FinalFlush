package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiceGamePage {
public WebDriver driver;
	
	public static WebElement element;

	public DiceGamePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static WebElement BetAmountinputField(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='LabelInput__MainInput-sc-zkip7h-6 jMmTxe'])[1]"));
	}
	
	public static WebElement BetButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='BET']"));
	}
	
	public static WebElement LatestResultDiceGame(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='PastBetButton__PastBetButtonWrapper-sc-pe28g7-0 joejdF']"));
	}
	
	public static WebElement DiceGameSettingICon(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='SidebarFooterCommands__CommandButtonContent-sc-gpcbvp-5 itAQDv'])[1]"));
	}
	public static WebElement DiceGameRulesICon(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='SidebarFooterCommands__CommandButtonContent-sc-gpcbvp-5 itAQDv'])[2]"));
	}
	

	public static WebElement DiceGameLiveStatusIcon(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='SidebarFooterCommands__CommandButtonContent-sc-gpcbvp-5 itAQDv'])[3]"));
	}
	
	public static WebElement DiceGameFairnessIcon(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='SidebarFooterCommands__CommandButtonContent-sc-gpcbvp-5 itAQDv'])[4]"));
	}

	
	public static WebElement DiceGameRulesCrossIcon(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']"));
	}

	
	public static WebElement DiceGameAutoButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='DiceSidebar__BettingVariantButton-sc-4stjuu-4 hCNjdI']"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
