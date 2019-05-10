package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBHome {
	
	WebDriver driver;
	//WebElement a = driver.findelement(By.id("...")); Initially we used to do like this
	
	By Unm = By.id("email");
	By Pwd = By.name("pass");
	By Log = By.id("loginbutton");
	
	By Forgot = By.linkText("Forgotten account?");
	
	public FBHome(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Umethod()
	{
		driver.findElement(Unm).sendKeys("abc");
	}
	public void Pmethod()
	{
		driver.findElement(Pwd).sendKeys("test");
	}
	public void Lmethod()
	{
		driver.findElement(Log).click();
	}
	public void ForgotLnk()
	{
		driver.findElement(Forgot).click();
	}
}
