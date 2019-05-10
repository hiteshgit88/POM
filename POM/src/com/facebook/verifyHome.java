package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyHome {
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
	  FBHome f1 = new FBHome(driver);
	  f1.Umethod();
	  f1.Pmethod();
	  f1.Lmethod();
  }
  @Test
  public void Forgot() {
	  FBHome f1 = new FBHome(driver);
	  f1.ForgotLnk();
  }
}
