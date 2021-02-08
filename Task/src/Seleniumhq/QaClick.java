package Seleniumhq;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QaClick {
	
	WebDriver driver;
	   
	   @BeforeTest
	   public void Setup()
	   {
			//ChromeOptions opt =new ChromeOptions();
			//opt.addArguments("--disable-notifications");
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://www.qaclickacademy.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   
	   }
	   
	   @Test(priority=1)
	   public void VerifyLink()
	   {
		   driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		   driver.findElement(By.xpath("//a[text()='Practice']")).click();

	   }
	   
	
	   @Test(priority=2)
	   public void VerifyRadisoButton()
	   {
		WebElement d =driver.findElement(By.xpath("//input[starts-with(@value,'radio1')]"));
        d.click();		
        boolean m =driver.findElement(By.xpath("//input[starts-with(@value,'radio1')]")).isDisplayed();
	    Assert.assertTrue(m);
		//boolean r =driver.findElement(By.xpath("//input[starts-with(@value,'radio2')]")).isEnabled();
		//Assert.assertEquals(r, true);
		//boolean s =driver.findElement(By.xpath("//input[starts-with(@value,'radio3')]")).isSelected();
		//Assert.assertEquals(s, false);
	
	   }
	   
	   @Test(priority=3)
	   public void VerifyCountry()
	   {		   		   
			driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("India");		   
	   }
	
	   @Test(priority=4)
	   public void VerifyDropDown() 
	   {
		  driver.findElement(By.xpath("html/body/div[1]/div[3]/fieldset/select")).sendKeys("Option1");;
		   		   		   
	   }
	   
	   @Test(priority=5)
	   public void VerifyCheckBox()
	   {
		   driver.findElement(By.xpath("//input[starts-with(@id,'checkBoxOption1')]")).click();
		   
	   }
	   
	   
	   @Test(priority=6)
	   public void VerifySwitchWindow()
	   {
		   String parent = driver.getWindowHandle();

		   driver.findElement(By.xpath("//button[starts-with(@id,'openwindow')]")).click();
		   Set<String> child = driver.getWindowHandles();
			for(String window :child)
			{
				driver.switchTo().window(window);
				
				if(!parent.equalsIgnoreCase(window))
				{
				    //driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
				    driver.close();
				}
				
				
				driver.switchTo().window(parent);
			}
		   
	   }
	   
	   @Test(priority=7)
	   public void VerifySwitchTab()
	   {
		   String parent = driver.getWindowHandle();

		   driver.findElement(By.xpath("//a[starts-with(@id,'opentab')]")).click();
		   Set<String> child = driver.getWindowHandles();
			for(String window :child)
			{
				driver.switchTo().window(window);
				
				if(!parent.equalsIgnoreCase(window))
				{
				    driver.close();
				}
				
				
				driver.switchTo().window(parent);
			}
			

		   
	   }
	   @Test(priority=8)
	   public void VerifySwitchAlert()
	   {
		    driver.findElement(By.xpath("//input[starts-with(@id,'name')]")).sendKeys("sangavi");
		    driver.findElement(By.xpath("//input[starts-with(@id,'alertbtn')]")).click();

			Alert alt = driver.switchTo().alert();
			String s = alt.getText();
			alt.accept();


	   }
	   
	   @Test(priority=9)
	   public void VerifyScrolldown() throws InterruptedException
	   {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		    // js.executeScript("window.scrollBy(0,1000)");
			//Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-4000)");
			Thread.sleep(2000);	   }
	  
	   @Test(priority=10)
	   public void VerfyHideandShow() throws InterruptedException
	   {
		   driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("Value");
	   }

	 
	   @Test(priority=11)
	   public void VerifyWebTable1()
	   {
		    //single column value
			WebElement col = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]/td[2]"));
	        String s= col.getText();
	        System.out.println(s);
	        //single row value
	        WebElement row = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]"));
	        System.out.println(row.getText());
	   }
	   
	   @Test(priority=11)
	   public void VerifyWebTable2()
	   {
		   List<WebElement> rows =  driver.findElements(By.xpath("//div[@class='tableFixHead']/thead/tr[1]"));
	       int p = rows.size();
	       System.out.println(p);
	       for(int i=0;i<=rows.size()-1;i++)
	       {
	    	   List<WebElement> column= driver.findElements(By.tagName("td"));
	    	   for(int j=0;j<=column.size()-1;j++)
	    	   {
	    		   String str = column.get(j).getText();
	    		   System.out.println(str);
	    	   }
	       }
		}
	
	   @Test(priority=12)
	   public void VerifyMouseOver() throws InterruptedException 
	   {
		    WebElement element = driver.findElement(By.xpath("//button[@id='mousehover']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			actions.click().build().perform(); 
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			    // js.executeScript("window.scrollBy(0,1000)");
				//Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,-8000)");
				Thread.sleep(2000);
	   }
	   
	   @Test(priority=13)
	   public void VerifyScreenShots() throws IOException
	   {
		    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Users\\Sangavi\\Desktop\\ScreenShotSel\\QaClick.jpg"));
	   }


	   
	   @AfterTest(enabled=false)
	   public void Teardown()
	   {
		driver.close();
	   }
}
