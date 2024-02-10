package com.OrangeHRMAutomation.QA.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UncheckCnt 
{

	@Test
	public void checkbox() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");	
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total Number of checkboxes"  +checkbox.size());
		try
		{
			for(int i=0;i<checkbox.size();i++)
			{
				checkbox.get(i).click();
			}
		}
		catch(Exception obj)
		{
			obj.printStackTrace();
		}
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		int checkedcount=0,uncheckedcount=0;
		for(int i=0;i<checkbox.size();i++)
		{
			if(checkbox.get(i).isSelected())
			{
				checkedcount++; 
			}
			else
			{
				uncheckedcount++;
			}
		}  	  
		System.out.println("Total number of checkboxes checked "  +checkedcount);
		System.out.println("Total number of unchecked  checkboxes "  +uncheckedcount);
	}
}



