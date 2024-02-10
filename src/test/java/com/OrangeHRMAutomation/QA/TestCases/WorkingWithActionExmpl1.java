package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class WorkingWithActionExmpl1 extends BaseClass2
{
  @Test(priority=0)
  public void LunchApplication ()
  {
	driver.get("https://www.facebook.com/"); 
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  @Test(priority=1)  
  public void LoginFaceBook()
  {
	Actions obj= new Actions(driver);
	obj.sendKeys("srinu").build().perform();
	obj.sendKeys(Keys.TAB).build().perform();
	obj.sendKeys("654dhgfvv").build().perform();
	obj.sendKeys(Keys.TAB).build().perform();
	obj.sendKeys(Keys.TAB).build().perform();
	obj.sendKeys(Keys.TAB).build().perform();
	obj.sendKeys(Keys.ENTER).build().perform();
	JavascriptExecutor sj=(JavascriptExecutor)driver;
	sj.executeScript("document.getElementById('identify_email').value='srinu.banoth04'");	
	
  }
}
