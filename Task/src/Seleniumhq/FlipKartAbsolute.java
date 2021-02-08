package Seleniumhq;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class FlipKartAbsolute {

	

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sangavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.FlipKart.com");  
	  driver.manage().window().maximize();	
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
		
	  
	    List<WebElement> d=driver.findElements(By.tagName("a"));
	    List as=new ArrayList<WebElement>();
		
		for(WebElement aa :d)
		{
			
			as.add(aa.getText());
			//int s =as.size();
			//System.out.println(s);
 		}	
		for(Object obj :as)
		{
			System.out.println(obj);
			
		}
		 System.out.println("&&&&&&&&&&&&&&&&&&&");
		 Collections.sort(as);
		
		 for(Object ob : as)
		 {
			 System.out.println(ob);
		 }
	    
//		for(Object obj : as)
//		{
//	        //as.size();
//			int s= d.size();
//			System.out.println(s);
//			
//		}
//		
//       // Collections.sort(as);
//		System.out.println(as);
//		for(Object ob:as)
//		{
//			System.out.println(ob);
//		}
		
		
	}

}
