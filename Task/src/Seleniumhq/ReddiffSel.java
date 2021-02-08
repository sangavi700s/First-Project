package Seleniumhq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReddiffSel {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.navigate().to("http://www.rediff.com");
		//driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Sangavi");
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("sang123@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("sang123");		
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("sang123");		
		driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys("Jeeva123@gmail.com");		
		driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]")).sendKeys("9867566798");			
		driver.findElement(By.xpath("//input[starts-with(@class,'captcha')]")).sendKeys("7n7p");		
		
		WebElement Day =driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		Select seld =new Select(Day);
		seld.selectByIndex(21);
		List<WebElement> t = seld.getOptions();
		int j = t.size();
		System.out.println("Day size is:"+j);
		
		WebElement Month =driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		Select selm =new Select(Month);
		selm.selectByIndex(21);
		List<WebElement> s = selm.getOptions();
		int n = s.size();
		System.out.println("Day size is:"+n);
		
		WebElement Year =driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		Select sely =new Select(Year);
		sely.selectByIndex(21);
		List<WebElement> e = sely.getOptions();
		int y = e.size();
		System.out.println("Day size is:"+y);


		
		//RadioButton
		
		boolean d = driver.findElement(By.xpath("//input[starts-with(@value,'m')]")).isSelected();
        System.out.println(d);
        boolean g = driver.findElement(By.xpath("//input[starts-with(@value,'f')]")).isEnabled();
        System.out.println(g);
        boolean h = driver.findElement(By.xpath("//input[starts-with(@value,'m')]")).isDisplayed();
        System.out.println(h);
        
        
       // boolean g = driver.findElement(By.xpath("//input[text()='f']")).isEnabled();
	   // System.out.println(g);
	   // boolean s = driver.findElement(By.xpath("//input[text()='Custom']")).isDisplayed();
	   // System.out.println(s);

        
        //DropDown       
		WebElement Country = driver.findElement(By.xpath("//select[@id='country']"));
		Select sel =new Select(Country);
		sel.selectByVisibleText("India");
		List<WebElement> u = sel.getOptions();
		int l = u.size();
		System.out.println("Country size is:"+l);
		for(int i=0;i<=l-1;i++)
		{
			String b = u.get(i).getText();
			System.out.println(b);
		}
		
		
		
		WebElement city = driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']"));	
        Select ce =new Select(city);
		ce.selectByVisibleText("Cuttack");		
		List<WebElement> cl = sel.getOptions();
		int o = cl.size();
		System.out.println("City size is:"+o);
		for(int i=0;i<=o-1;i++)
		{
			String w = cl.get(i).getText();
			System.out.println(w);
		}
		


	
		
		

        
	}

	
}
