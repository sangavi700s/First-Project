package Seleniumhq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@role='button']")).click();
        driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("Sangavi");

		
		boolean p = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
        System.out.println(p);
        boolean g = driver.findElement(By.xpath("//label[text()='Male']")).isEnabled();
	    System.out.println(g);
	    boolean s = driver.findElement(By.xpath("//label[text()='Custom']")).isDisplayed();
	    System.out.println(s);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel =new Select(day);
		sel.selectByIndex(20);
		List<WebElement> d = sel.getOptions();
		int f = d.size();
		System.out.println(f);
		for(int i=0;i<=f-1;i++)
		{
			String h = d.get(i).getText();
			System.out.println(h);
		}
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select se = new Select(month);
	    se.selectByVisibleText("Mar");
	    List<WebElement> e = sel.getOptions();
		int y = e.size();
		System.out.println(y);
		for(int i=0;i<=y-1;i++)
			
		{
			String h = e.get(i).getText();
			System.out.println(h);
		}
		
	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select t = new Select(year);
	    t.selectByValue("1980");
	    List<WebElement> l = sel.getOptions();
		int m = l.size();
		System.out.println(m);
		for(int i=0;i<=m-1;i++)
			
		{
			String h = l.get(i).getText();
			System.out.println(h);
		}
		
	
	}

}
