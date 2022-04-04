package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VIPPage {
	
	
	
	public static WebElement DropdownVipLink(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='UserDropdownMenu__DropdownItem-sc-qt4bc8-5 iLdCch'])[2]"));
	} 

	public static WebElement Loyalitytext(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Loyality']"));
	} 
	
	public static WebElement ClaimFreeSpin(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM FREE SPIN']"));
	} 
	
	public static WebElement Claim(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM']"));
	} 
	
	public static WebElement ClaimRewardstab(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM REWARDS']"));
		
	} 
	
	public static WebElement Rewards(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='REWARDS']"));
	} 
	
	public static WebElement ClaimRewardsChooseYourRewardCancelbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CANCEL']"));
	} 
	
	
	
	public static WebElement ClaimRewardsChooseYourRewardClaimSelectedRewards(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM SELECTED REWARD']"));
	} 
	
	public static WebElement TotalPointsSection(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='Header__HeadEl2-sc-jdyd2k-3 zhmkJ'])[2]"));
	} 
	
	public static WebElement ClaimRewardsChooseYourRewardFirstRadio(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='ChooseRewardModal__Img-sc-1d4l1so-17 jEpHzN'])[1]"));
	} 
	public static WebElement ClaimRewardsChooseYourRewardSecondRadio(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='ChooseRewardModal__Img-sc-1d4l1so-17 jEpHzN'])[2]"));
	} 
	public static WebElement ClaimRewardsChooseYourRewardThirdRadio(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='ChooseRewardModal__Img-sc-1d4l1so-17 jEpHzN'])[3]"));
	} 
	public static WebElement ClaimRewardsChooseYourRewardFourthRadio(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='ChooseRewardModal__Img-sc-1d4l1so-17 jEpHzN'])[4]"));
	} 
	public static WebElement ClaimRewardsButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='Rewards__Div4-sc-gl9zn9-6 ixYJuK'])[1]"));
	} 
	
}
