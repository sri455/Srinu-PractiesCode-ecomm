package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass1;

public class BrowseStackExmple extends BaseClass1
{
  @Test(priority=2)
  public void LunchAPP()
  {
	driver.get("https://www.browserstack.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  @Test(priority=3)
  public void ProductAccess()
  {
	String productTag= "product-menu-toggle";
   WebElement productAcc=  driver.findElement(By.id(productTag));
	Actions act=new Actions(driver);
	act.moveToElement(productAcc).build().perform();
	
	//click action//
	String LivePath="//div[@class='dropdown-link-wrapper']//div[@class='dropdown-link-heading' and (text()=' Live ')]";
	WebElement livpath=driver.findElement(By.xpath(LivePath));
	Actions Acc2=new Actions(driver);
	Acc2.click(livpath).build().perform();	
	
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	String TestStartPath="(//input[@name='url' and @placeholder='www.website.com'])[1]";
	WebElement teststarpath=driver.findElement(By.xpath(TestStartPath));
	jse.executeScript("arguments[0].scrollIntoView(true);",teststarpath);
	jse.executeScript("window.scrollBy(0,-350)","");
	Acc2.sendKeys(teststarpath,"www.gmail.com").build().perform();
	Acc2.sendKeys(Keys.TAB).build().perform();
	Acc2.sendKeys(Keys.ENTER).build().perform();
	
  }
}
