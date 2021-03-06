package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.com.Testbase;

public class Loginpage extends Testbase

{
	@FindBy(name="email")
	public WebElement userNametxtbx;
	
	@FindBy(name="password")
	public WebElement passwordtxtbx;
	
	@FindBy(id="continue")
	public WebElement contxtbx;

	
	@FindBy(id="signInSubmit")
	public WebElement loginbtn;
	
	public Loginpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	
	

}
