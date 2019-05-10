package TestScript;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T1 {
	WebDriver driver = null;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "abc");
  }
  
  @AfterMethod()
  public void status(ITestResult r) throws IOException 
  {
	  if(r.getStatus() == ITestResult.FAILURE)
		  
	  {
		  Date d = new Date();
		  DateFormat df = new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		  String time = df.format(d);
		  
		  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(scr, new File("src\\\\Screenshots\\img"+time+".png"));
	  }
  }
}
