package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testbase;

public class Loginpage extends Testbase {
	
	
	WebDriver Idriver;
	public Loginpage(WebDriver rdriver) {
		
		Idriver= rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement Username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement clicklogin;
	
	public void setusernme1(String usr) {
		
		Username.sendKeys(usr);
		
}
public void Password(String psw) {
		
		
		txtpassword.sendKeys(psw);
	}
public void submit()
{
	clicklogin.click();
	
}

}
