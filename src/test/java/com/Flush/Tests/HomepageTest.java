package com.Flush.Tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flush.PageObjects.DashboardPage;
import com.Flush.PageObjects.Homepage;
import com.Flush.PageObjects.WelcomePopup;
import com.Flush.Utilities.BaseClass;

public class HomepageTest extends BaseClass {
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
		
		

		wait = new WebDriverWait(driver, 50);

		Homepage.Loginbutton(driver).click();

		log.info("Login button clicked successfully");

		WelcomePopup.Welcomeemail(driver).sendKeys("satishkumar@rapidinnovation.dev");

		WelcomePopup.Welcomepassword(driver).sendKeys("Satvik@123");

		WelcomePopup.Welcomeplaynow(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));
		
		

	}
	
	@Test(enabled = true, priority = 1)
	public void UserLoginLogout() throws IOException {

		Homepage.Loginbutton(driver).click();

		WelcomePopup.Welcomeemail(driver).sendKeys("satishkumar@rapidinnovation.dev");

		WelcomePopup.Welcomepassword(driver).sendKeys("Satvik@123");

		WelcomePopup.Welcomeplaynow(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WALLET']")));

		DashboardPage.Userdropdown(driver).click();

		DashboardPage.Logout(driver).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='LOG IN']")));

	}

	@Test(enabled = false, priority = 1)
	public void Logout() throws IOException {
		
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Loginbutton"))));
	}

	@Test(enabled = false, priority = 1)
	public void Cashier() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Cashier"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Cashierpopupdropdown"))));

		driver.findElement(By.xpath(p.getProperty("Crossicon"))).click();
	}

	@Test(enabled = false, priority = 1)
	public void VIP() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("VIP"))).click();
	}

	@Test(enabled = false, priority = 1)
	public void Transaction() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Transaction"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Transactionpageheader"))));
	}

	@Test(enabled = false, priority = 1)
	public void TransactionPageTabsChecking() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Transaction"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Transactionpageheader"))));

		driver.findElement(By.xpath(p.getProperty("TransactionDepositTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TransactionDepositTab"))));

		driver.findElement(By.xpath(p.getProperty("TransactionWithdrawTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TWnowithdrawls"))));

		driver.findElement(By.xpath(p.getProperty("TransactionRewardsTab"))).click();

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TRnoRewards"))));

		driver.findElement(By.xpath(p.getProperty("TransactionBetsTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TransactionBetsGameText"))));
	}

	@Test(enabled = false, priority = 1)
	public void Statisticspagechecking() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Statistics"))).click();

		driver.findElement(By.xpath(p.getProperty("StatisticsBreakDownTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("StatissticsBetsText"))));

		driver.findElement(By.xpath(p.getProperty("Statisticsoveralltab"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("StatisticsOverAllWinsSection"))));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(p.getProperty("StatisticsOverAllLossesSection"))));

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("StatisticsOverAllBetsSection"))));
	}

	@Test(enabled = false, priority = 1)
	public void statistics() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Statistics"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Statisticsoveralltab"))));
	}

	@Test(enabled = false, priority = 1)
	public void Logot() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Loginbutton"))));
	}

	@Test(enabled = false, priority = 1)
	public void Settings() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));
	}

	@Test(enabled = false, priority = 1)
	public void Changepassword() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Savechanges"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Successfulmessage"))));

		WebElement Successmessage = driver.findElement(By.xpath(p.getProperty("Successfulmessage")));

		String Message = Successmessage.getAttribute("innerText");

		System.out.println(Message);

		String str = Message;

		str = str.replaceAll("\\s", "");

		String ActualTitle = str;

		String ExpectedTitle = "SuccessYourpasswordwasupdatedsuccessfully!";

		// Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	@Test(enabled = false, priority = 1)
	public void Passwordcancel() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Cancel"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));
	}

	@Test(enabled = false, priority = 1)
	public void Oldpasswordinvalid() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@12");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Savechanges"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Successfulmessage"))));

		WebElement Successmessage = driver.findElement(By.xpath(p.getProperty("Successfulmessage")));

		String Message = Successmessage.getAttribute("innerText");

		System.out.println(Message);

		String str = Message;

		str = str.replaceAll("\\s", "");

		String ActualTitle = str;

		String ExpectedTitle = "ErrorOldpasswordisincorrect.";

		// Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	@Test(enabled = false, priority = 1)
	public void Passwordnotmatch() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).clear();

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@12");

		driver.findElement(By.xpath(p.getProperty("Savechanges"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Successfulmessage"))));

		WebElement Successmessage = driver.findElement(By.xpath(p.getProperty("Successfulmessage")));

		String Message = Successmessage.getAttribute("innerText");

		System.out.println(Message);

		String str = Message;

		str = str.replaceAll("\\s", "");

		String ActualTitle = str;

		String ExpectedTitle = "ErrorPasswordsdonotmatch.";

		// Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	@Test(enabled = false, priority = 1)
	public void walletbalacelist() throws InterruptedException, IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("ETH"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("LTC"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("DOGE"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("MATIC"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("BNB"))).click();

	}

	@Test(enabled = false, priority = 1)
	public void changingusername() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		driver.findElement(By.xpath(p.getProperty("UserNameEditicon"))).click();

		WebElement inputbox = driver.findElement(By.xpath(p.getProperty("UserNameInputBox")));

		inputbox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		driver.findElement(By.xpath(p.getProperty("UserNameInputBox"))).clear();

		driver.findElement(By.xpath(p.getProperty("UserNameInputBox"))).clear();

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath(p.getProperty("UserNameInputBox"))).sendKeys("Msdhoni" + rand_int1);

		driver.findElement(By.xpath(p.getProperty("UserNameUpdateButton"))).click();

	}

	

	@Test(enabled = false, priority = 1)
	public void LoginWelcomeForgot() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 25);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeForgotPassword"))));

		driver.findElement(By.xpath(p.getProperty("WelcomeForgotPassword"))).click();

		driver.findElement(By.name(p.getProperty("PasswordRecoveryEmailInputbox")))
				.sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("PasswordRecoverySendButton"))).click();

		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(p.getProperty("PasswordRequestSentToEmailText"))));

			WebElement forgtorpasswordmessage = driver
					.findElement(By.xpath(p.getProperty("PasswordRequestSentToEmailText")));

			String Expected = forgtorpasswordmessage.getAttribute("innerText");

			System.out.println(Expected);

		} catch (Exception e) {

			WebElement forgtorpasswordmessage = driver
					.findElement(By.xpath(p.getProperty("PasswordRequestSentToEmailText")));

			String Expected = forgtorpasswordmessage.getAttribute("innerText");

			System.out.println(Expected);

		}

	}

	@Test(enabled = false, priority = 1)
	public void RecoveryPasswordBackToLogin() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 25);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeForgotPassword"))));

		driver.findElement(By.xpath(p.getProperty("WelcomeForgotPassword"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("PasswordRecoveryBackToLogin"))));

		driver.findElement(By.xpath(p.getProperty("PasswordRecoveryBackToLogin"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeForgotPassword"))));
	}

	@Test(enabled = false, priority = 1)
	public void LoginWelcomeregistration() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		String name = "satish";

		wait = new WebDriverWait(driver, 25);

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		driver.findElement(By.xpath(p.getProperty("Registration"))).click();

		driver.findElement(By.xpath(p.getProperty("RegisterUserName"))).sendKeys(name + rand_int1);

		driver.findElement(By.xpath(p.getProperty("RegisterEmailid"))).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath(p.getProperty("RegisterPassword"))).sendKeys("satish@123");

		driver.findElement(By.xpath(p.getProperty("TermsAndConditionsCheckbox"))).click();

		WebElement Playnowbutton = driver.findElement(By.xpath(p.getProperty("PlayNowbutton")));

		Actions builder = new Actions(driver);

		builder.moveToElement(Playnowbutton).click(Playnowbutton);

		builder.perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("DropDown"))));
	}

	@Test(enabled = false, priority = 1)
	public void LoginWelcomeGoogle() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		driver.findElement(By.xpath(p.getProperty("Registration"))).click();

		wait = new WebDriverWait(driver, 25);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeGoogle"))));

		driver.findElement(By.xpath(p.getProperty("WelcomeGoogle"))).click();

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailEmail"))));

		driver.findElement(By.xpath(p.getProperty("GmailEmail"))).sendKeys("psathish@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("EmailNext"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		driver.findElement(By.xpath(p.getProperty("GmailPassword"))).sendKeys("Satvik@786");

		driver.findElement(By.xpath(p.getProperty("PasswordNext"))).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

		System.out.println("Login through gmail successfully");

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		System.out.println("Logout user successfully");

	}

	@Test(enabled = false, priority = 1)
	public void SignupLogin() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Signup"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		driver.findElement(By.xpath(p.getProperty("Login"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	@Test(enabled = false, priority = 1)
	public void signup() throws IOException, InterruptedException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		String name = "satish";

		wait = new WebDriverWait(driver, 50);

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath(p.getProperty("Signup"))).click();

		driver.findElement(By.xpath(p.getProperty("RegisterUserName"))).sendKeys(name + rand_int1);

		driver.findElement(By.xpath(p.getProperty("RegisterEmailid"))).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath(p.getProperty("RegisterPassword"))).sendKeys("satish@123");

		driver.findElement(By.xpath(p.getProperty("TermsAndConditionsCheckbox"))).click();

		WebElement Playnow = driver.findElement(By.xpath(p.getProperty("PlayNowbutton")));

		Thread.sleep(3000);

		Playnow.click();

	}

	@Test(enabled = false, priority = 1)
	public void Google() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Google"))));

		driver.findElement(By.xpath(p.getProperty("Google"))).click();

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailEmail"))));

		driver.findElement(By.xpath(p.getProperty("GmailEmail"))).sendKeys("psathish@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("EmailNext"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		driver.findElement(By.xpath(p.getProperty("GmailPassword"))).sendKeys("Satvik@786");

		driver.findElement(By.xpath(p.getProperty("PasswordNext"))).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

		System.out.println("Login through gmail successfully");

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		System.out.println("Logout user successfully");

	}

	@Test(enabled = false, priority = 1)
	public void JoinWithYourEmail() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		Random rand = new Random();

		String name = "satish";

		int rand_int1 = rand.nextInt(1000);

		wait = new WebDriverWait(driver, 20);

		WebElement email = driver.findElement(By.xpath(p.getProperty("Joinemail")));

		Actions action = new Actions(driver);

		action.moveToElement(email).perform();

		email.click();

		driver.findElement(By.xpath(p.getProperty("RegisterUserName"))).sendKeys(name + rand_int1);

		driver.findElement(By.xpath(p.getProperty("RegisterEmailid"))).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath(p.getProperty("RegisterPassword"))).sendKeys("satish@123");

		driver.findElement(By.xpath(p.getProperty("TermsAndConditionsCheckbox"))).click();

		driver.findElement(By.xpath(p.getProperty("PlayNowbutton"))).click();

	}

	public void JoinEmailLogin() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 20);

		WebElement email = driver.findElement(By.xpath(p.getProperty("Joinemail")));

		Actions action = new Actions(driver);

		action.moveToElement(email).perform();

		email.click();

		driver.findElement(By.xpath(p.getProperty("Login"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));
	}

	public void JoinEmailGoogleLogin() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Joinemail"))));

		WebElement email = driver.findElement(By.xpath(p.getProperty("Joinemail")));

		Actions action = new Actions(driver);

		action.moveToElement(email).perform();

		email.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("JoinEmailGoogle"))));

		driver.findElement(By.xpath(p.getProperty("JoinEmailGoogle"))).click();

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailEmail"))));

		driver.findElement(By.xpath(p.getProperty("GmailEmail"))).sendKeys("psathish@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("EmailNext"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		driver.findElement(By.xpath(p.getProperty("GmailPassword"))).sendKeys("Satvik@786");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("PasswordNext"))));

		driver.findElement(By.xpath(p.getProperty("PasswordNext"))).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

		System.out.println("Login through gmail successfully");

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

	}

	public void adminpanel() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("AdminURL"));

		driver.findElement(By.name(p.getProperty("AdminUsername"))).sendKeys("");

		driver.findElement(By.name(p.getProperty("AdminPassword"))).sendKeys("");

		driver.findElement(By.xpath(p.getProperty("AdminPanelLogin"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("AdminDashboardLogout"))));
	}

	public void Dicegame() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("DiceGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Registration"))));
	}

	public void Dicegamelogin() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("DiceGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	public void Crashgame() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("CrashGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Registration"))));

	}

	public void CrashgameLogin() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("CrashGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	public void Minesgame() throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("MinesGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Registration"))));
	}

	public void Minesgamelogin() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("MinesGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	public void Wheelgame() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("WheelsGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Registration"))));

	}

	public void Wheelgamelogin() throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get(p.getProperty("WheelsGame"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("BetButton"))));

		driver.findElement(By.xpath(p.getProperty("BetButton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	@AfterMethod
	public void EndTest() {
		driver = teardown();
	}

}
