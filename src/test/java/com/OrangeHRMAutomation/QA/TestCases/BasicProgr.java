 package com.OrangeHRMAutomation.QA.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicProgr {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51168/pak-vs-eng-1st-t20i-england-tour-of-pakistan-2022");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 List<WebElement> rows= driver.findElements(By.xpath("(//a[contains(text(),' Iftikhar Ahmed ')]/parent::div/following-sibling::div)[6]"));
		  for(int i=0;i<rows.size();i++)
		  {
		  String RowesIn=rows.get(i).getText();
			System.out.println("ifithak Ahamad strirate is "+RowesIn);
			driver.quit();
		  }
		  
	}
	
	}

