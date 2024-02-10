package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D0ubleClick 
{

	WebDriver driver;
  @BeforeClass
  public void setup()
  {
	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.navigate().refresh();
		 System.out.println("Refresh is successfully");
      driver.get("https://www.facebook.com/");
     
        }   
       
     
  @Test
  public void f()
  {
	  
      Actions act=new Actions(driver);        
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        act.doubleClick().build().perform();
       // WebElement login=driver.findElement(By.xpath("//button[@id='u_0_5_tI']"));
        //act.doubleClick(login).perform();
        
  }
  @Test
  public void AlertsClass()
  {
	  Alert alt=driver.switchTo().alert();
	  String getText=alt.getText();
	  System.out.println(getText);

  }
}
