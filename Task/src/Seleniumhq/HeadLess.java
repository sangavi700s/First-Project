package Seleniumhq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

	public static void main(String[] args) {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String t = driver.getTitle();
		System.out.println(t);

		
//		 List<WebElement> d=driver.findElements(By.tagName("a"));
//		 // List<WebElement> d = driver.findElements(By.tagName("a"));
//			int s= d.size();
//			System.out.println(s);
//			for(int i=0;i<=s-1;i++)
//			{
//				String h= d.get(i).getText();
//				System.out.println(h);
//			}
//			for(WebElement aa :d)
//			{
//				String j = aa.getAttribute("href");
//				System.out.println(j);
//			}	  
//		

	}

}
