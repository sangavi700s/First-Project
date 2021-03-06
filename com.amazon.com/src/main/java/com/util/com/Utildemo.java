package com.util.com;

import org.openqa.selenium.Alert;

import com.amazon.com.Testbase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;





public class Utildemo extends Testbase
{

	
		public static void max_win()
		{
			driver.manage().window().maximize();
		}
		
		
		public static void implicit_wait(int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		
		public static void SelectByvisibleText(WebElement ele, String value)
		{
			Select sel=new Select(ele);
			
			sel.selectByVisibleText(value);
		}
		
		public static void SelectByvalue(WebElement ele, String value)
		{
			Select sel=new Select(ele);
			
			sel.selectByValue(value);
		}
		
		public static void SelectByindex(WebElement ele, int value)
		{
			Select sel=new Select(ele);
			
			sel.selectByIndex(value);
		}
		
		public static void AlertOk()
		{
			Alert alt=driver.switchTo().alert();
			
			alt.accept();
		}
		
		public static void AlertCancle()
		{
			Alert alt=driver.switchTo().alert();
			
			alt.dismiss();
		}


	}


