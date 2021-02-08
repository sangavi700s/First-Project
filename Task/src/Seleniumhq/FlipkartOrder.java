package Seleniumhq;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartOrder {

	WebDriver driver;
	
	@BeforeTest
	   public void Setup()
	   {	
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("http://www.FlipKart.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   }
	@Test(priority=1)
	public void VerifyMobile() throws InterruptedException
	{
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form/div[1]/input")).sendKeys("7338710124");
		driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("kavi@2620");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();		
        Thread.sleep(1000);
	}	
	
	
    @Test(priority=2)
	public void VerifySearchClick() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("teady bear toy 6 feet");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form/div[1]/button"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	/*@Test(priority=3)
	public void VerifySearchLink()
	{

		String parent = driver.getWindowHandle();				
		driver.findElement(By.xpath("//a[@title='KHATU SHYAM ENTERPRISES Premium Quality Soft Blue Teddy Bear 3 feet-90.6 cm  - 90.6 cm']")).click();
		
		Set<String> child = driver.getWindowHandles();
		for(String window :child)
		{
			driver.switchTo().window(window);
			
			if(!parent.equalsIgnoreCase(window))
			{
		    	//driver.findElement(By.xpath("//button[starts-with(@class,'_KpZ')]")).click();
		    	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		    	driver.close();

			}
						
			driver.switchTo().window(parent);
			
			
		}
		
	}*/
	@Test(priority=3)
	public void VerifyAddtocart()
	{
		
		driver.findElement(By.xpath("//a[@title='KHATU SHYAM ENTERPRISES Premium Quality Soft Blue Teddy Bear 3 feet-90.6 cm  - 90.6 cm']")).click();
        
		String parentwindow=driver.getWindowHandle();
		
		Set<String> childwindow=driver.getWindowHandles();
		
		for(String aa :childwindow)
		{
			if(!parentwindow.equals(aa))
			{
				driver.switchTo().window(aa);
				
		    	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
							
			}
		
		}
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
        WebElement ele=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//ul[@class='pO9syL undefined']/li[10]")).click();

		
	}
	
	@AfterTest(enabled=false)
	public void TearDown()
	{
		driver.close();
	}

			
	

}
