package com.OrangeHRMAutomation.QA.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class BaseClass2 
{ 
 public static WebDriver driver; 
 public static String browserName="chrome";
 public static SoftAssert softAssert =new SoftAssert();
 public static String configFilePath="D:\\SeleniumWorkes\\OrangeHRMAutomation\\src\\main\\java\\com\\OrangeHRMAutomation\\QA\\config\\config.properties";
 public Properties prop;
 
 public BaseClass2()
 {
 try
	{
	File fl = new File(configFilePath);
	FileInputStream fis = new FileInputStream(fl);
	prop = new Properties();
	prop.load(fis);
	softAssert = new SoftAssert();	
	}
	catch(FileNotFoundException e)
	{
	   e.printStackTrace();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	catch(Throwable e)
	{
	   e.printStackTrace();	
	}	
}
 @Test 
  public void InitializMethod()
  
		 {
	  if(browserName.compareToIgnoreCase("chrome")==0)
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	  }
	  else if(browserName.compareToIgnoreCase("firefox")==0)
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.out.println("please enter a browser chrome or firefox");
		  	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  System.out.println("I am from base class  ");
}
  
  
}