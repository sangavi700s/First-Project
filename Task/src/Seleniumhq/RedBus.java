package Seleniumhq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedBus {
	
	

WebDriver driver;

@BeforeTest
public void Setup()
{
		//ChromeOptions opt =new ChromeOptions();
		//opt.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.Redbus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	   
}

@Test
public void VerifyLocaion()
{
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madurai");
	driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label"));
	((JavascriptExecutor)driver).executeScript ("document.getElementById('\\\"search\\\"]/div/div[3]/div/label').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement fromDateBox=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label"));
	fromDateBox.clear();
	fromDateBox.sendKeys("03-Feb-2021");
	
	
}


@AfterTest(enabled=false)
public void Teardown()
{
	driver.close();
}

}