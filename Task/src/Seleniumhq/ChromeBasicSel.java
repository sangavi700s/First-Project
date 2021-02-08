package Seleniumhq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBasicSel {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\Users\Sangavi\Downloads\chromedriver_win32\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://www.fb.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		driver.navigate().to("http://www.Amazon.com");
		String a=driver.getTitle();
		System.out.println(a);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		driver.navigate().to("http://www.FlipKart.com");
		String f=driver.getTitle();
		System.out.println(f);
		String d=driver.getCurrentUrl();
		System.out.println(d);
		
		driver.close();
	
		
		
		
		
        }

}
