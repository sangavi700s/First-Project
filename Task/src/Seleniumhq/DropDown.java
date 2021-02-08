package Seleniumhq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel =new Select(day);
		sel.selectByIndex(12);
		List<WebElement> d = sel.getOptions();
		int f = d.size();
		System.out.println("Day size is:"+f);
		for(int i=0;i<=f-1;i++)
		{
			String h = d.get(i).getText();
			System.out.println(h);
		}
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select se = new Select(month);
	    se.selectByVisibleText("Mar");
		List<WebElement> e = se.getOptions();
		int s = e.size();
		System.out.println("Month size is:"+s);
		for(int i=0;i<=s-1;i++)
		{
			String n = e.get(i).getText();
			System.out.println(n);
		}
		


	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select m = new Select(year);
	    m.selectByValue("1940");
	    List<WebElement> u = m.getOptions();
		int a = u.size();
		System.out.println("Year size is:"+s);
		for(int i=0;i<=a-1;i++)
		{
			String p = u.get(i).getText();
			System.out.println(p);
		}
		
		
	//	driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div/div[1]/form/div[3]/a")).click();
		
	
	
	}

}
