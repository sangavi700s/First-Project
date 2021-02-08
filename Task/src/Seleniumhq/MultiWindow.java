package Seleniumhq;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		Set<String> child = driver.getWindowHandles();
		for(String window :child)
		{
			driver.switchTo().window(window);
			
			if(!parent.equalsIgnoreCase(window))
			{
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("javaselenium");
			    driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/div/div/span/a")).click();
			    driver.close();
			}
			
			
			driver.switchTo().window(parent);
		}
		
		
		



	}

}
