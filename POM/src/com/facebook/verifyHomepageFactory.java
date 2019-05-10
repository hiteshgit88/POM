package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyHomepageFactory {
	WebDriver driver = null;
			
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	
  @Test
  public void Login() {
	  //FBHomepageFactory f1 = new FBHomepageFactory(driver);
	  FBHomepageFactory f1 = PageFactory.initElements(driver, FBHomepageFactory.class);  //.class is used as it gives the byte code of that class
	  
	  f1.Loginmethod();
  }
}
