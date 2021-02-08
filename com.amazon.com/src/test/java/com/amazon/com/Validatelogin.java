package com.amazon.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.Loginpage;

public class Validatelogin extends Testbase {
	
   Loginpage login;
	
	@BeforeTest
	public void setUp()
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://www.amazon.com");
		login=new Loginpage();
	}
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actualTitle=login.verifyTitle();
		Assert.assertEquals(actualTitle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	
	@AfterTest(enabled=false)
	public void teardown()
	{
		driver.close();
	}
	

}
