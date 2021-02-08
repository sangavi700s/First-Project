package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutExcel {

	WebDriver driver;
	   
	   @BeforeTest
	   public void Setup()
	   {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://www.rediff.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	   @Test
	   public void VerifyLink()
	   {
		   driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	   }
	  @Test(dataProvider ="dp")
	  public void VerifyTest(String username,String password) throws InterruptedException
	  {
		  driver.findElement(By.xpath("//input[@id='login1']")).clear();
		  driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(username);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='password']")).clear();
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		  Thread.sleep(2000);
	  }
	   
	   @AfterTest
	   public void Teardown()
	   {
		  driver.close(); 
	   }
	      
	   @DataProvider(name="dp")
	   public Object[][] getdata1()
	   {
		   Object[][] obj = new Object[6][2];
		   
		   obj[0][0]="Selenium";
		   obj[0][1]="pass123";
		   
		   obj[1][0]="Abstract";
		   obj[1][1]="phyton";
		   
		   obj[2][0]="Webdriver";
		   obj[2][1]="jav123";
		   
		   obj[3][0]="Ibm";
		   obj[3][1]="P1234";
		   
		   obj[4][0]="Amazon";
		   obj[4][1]="java07";
		   
		   obj[5][0]="tcs";
		   obj[5][1]="javascript";
		  
		   
		   return obj;
	   }
	

}
