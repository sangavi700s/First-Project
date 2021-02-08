package Seleniumhq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationSel {

	public static void main(String[] args) {


		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--Enable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String h = driver.getTitle();
		System.out.println(h);
		
	}

}
