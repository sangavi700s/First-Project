package Seleniumhq;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException 
	
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver    driver=new ChromeDriver();
			driver.get("http://www.FlipKart.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
			
			driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form/div[1]/input")).sendKeys("7338710124");
			driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("kavi@2620");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();		
	        Thread.sleep(2000);
	        
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("teady bear toy 6 feet");

			driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form/div[1]/button")).click();
			
			String parent = driver.getWindowHandle();
			
			driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
			
			Set<String> child = driver.getWindowHandles();
			for(String window :child)
			{
				driver.switchTo().window(window);
				
				if(!parent.equalsIgnoreCase(window))
				{
			    	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
			    	driver.close();
				}
								
				driver.switchTo().window(parent);

			}
			

	}

}
