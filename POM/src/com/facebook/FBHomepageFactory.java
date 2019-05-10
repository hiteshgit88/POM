package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomepageFactory {
	
	WebDriver driver;
	//WebElement a = driver.findelement(By.id("...")); Initially we used to do like this
	
//	By Unm = By.id("email");
//	By Pwd = By.name("pass");
//	By Log = By.id("loginbutton");
	
	@FindBy(id = "email")WebElement Unm;
	@FindBy(how = How.NAME , using="pass")WebElement Pwd;
	@FindBy(how = How.ID , using="loginbutton") @CacheLookup WebElement Log;
	
	
	public FBHomepageFactory(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Loginmethod()
	{
		Unm.sendKeys("abc");
		Pwd.sendKeys("test");
		Log.click();
	}
}
