package com.amazon.com;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.com.Utildemo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	
	Properties pro;
	
	public static WebDriver driver;	

	public void OpenBrowser()
	{
		    String browsername=pro.getProperty("browsername");
		
		    if(browsername.equalsIgnoreCase("Chrome"))
		
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		
		
    	driver.get(pro.getProperty("url"));
		
		Utildemo.max_win();
		
		Utildemo.implicit_wait(40);
		
		
	}
	

	
	
	



}
