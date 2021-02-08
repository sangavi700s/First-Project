package Seleniumhq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

	WebDriver driver;
		
		@BeforeTest
		public  void Setup()
		{
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://www.amazon.com");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	       
	       }
		@Test
		public void VerifyClick()
		{
			driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		}
		
		@Test
		public void VerifyLogin()
		{
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sangsweety1994@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kavima2620");
			driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();							
		}
		
		@Test
		public void VerifySearch()
		{
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("handbags for ladies");
			driver.findElement(By.xpath("//input[@type='submit']")).click();

		}
		@Test
		public void VerifyCart()
		{
			driver.findElement(By.xpath("//a[@class='\"a-link-normal a-text-normal\"']")).click();

		}
		@AfterTest(enabled=false)
		public void  Teardown()
		{
			driver.close();
		}
}

