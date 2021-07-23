package Testinganno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo2 {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	 {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver= new ChromeDriver();
	 }

	@Test
	public void verifyGmailTitle()
	 {
	 driver.get("https://www.gmail.com");
	 Assert.assertEquals("Gmail", driver.getTitle());
	 }

	@Test
	public void verifyFacebookTitle()
	 {
	 driver.get("https://www.facebook.com");
	 Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	 }

	@AfterMethod
	public void closeBrowser(){
	 driver.close();
	 }
	} 
