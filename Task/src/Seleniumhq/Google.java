package Seleniumhq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
//	@Test
//	public void VerifySearch()
//	{
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
//		WebElement element=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
//		actions.click().build().perform();
//	}
	
	@Test
	public void Verifyclick()
	{
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		 List <WebElement> d =driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		 for(WebElement aa :d )
		 {
			  String s=aa.getText();
			  System.out.println(s);
			  
			 if(s.equals("selenium  tutorial"))
		    aa.click();
	     }
		 
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		 driver.findElement(By.xpath("//ul[@class='erkvQe']"));
		 driver.findElement(By.xpath("//ul[contains(text(),'selenium  tutorial')]")).click();
		 
		 
		 
//		    WebElement element=driver.findElement(By.xpath("//*[@id=\\\"tsf\\\"]/div[2]/div[1]/div[2]/div[2]/ul/li[2]"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).click().build().perform();
//			actions.click().build().perform();
	}
	
	@AfterTest(enabled=false)
	public void Teardown()
	{
		driver.close();
	}

}
