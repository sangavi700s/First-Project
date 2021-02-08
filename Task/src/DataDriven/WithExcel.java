package DataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithExcel {
	WebDriver driver;
	   
	   @BeforeTest
	   public void Setup()
	   {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.microfocus.com/brandcentral/employee");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	  @Test(dataProvider ="data")
	  public void VerifyTest(String username,String password) throws InterruptedException
	  {
		  driver.findElement(By.xpath("//input[@id='username']")).clear();
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
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
	   
	   @DataProvider(name="data")
	   public Object[][] getdata1() throws IOException
	   {
		   Excel exe=new Excel("C:\\Users\\Sangavi\\Desktop\\Excel\\Withexcelsheet.xlsx");
		   int r = exe.getRows("Sheet1");
		   int c= exe.getCells("Sheet1");
		   
		   Object[][] obj = new Object[r][c];
		   for(int i =0;i<r;i++)
		   {
			   for(int j=0;j<c;j++)
			   {
				   obj[i][j]=exe.getsheet("Sheet1",i,j);
			   }
		   }
		   
		   
		   return obj;
	   }
	


}
