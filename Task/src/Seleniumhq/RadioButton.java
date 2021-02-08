package Seleniumhq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		
		boolean d = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
        System.out.println(d);
        boolean g = driver.findElement(By.xpath("//label[text()='Male']")).isEnabled();
	    System.out.println(g);
	    boolean s = driver.findElement(By.xpath("//label[text()='Custom']")).isDisplayed();
	    System.out.println(s);

	}

}
