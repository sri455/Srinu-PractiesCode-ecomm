package com.OrangeHRMAutomation.QA.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxFinding 
{
	WebDriver driver;
	@Test
	public static void CheckBoxCnt() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		int cnt=checkbox.size();
		System.out.println("total no of the check boxs " +cnt);

	}


	@Test
	public void SelectedCheckBox()
	{
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		int cnt=checkbox.size();
		System.out.println("total no of the check boxs " +cnt);

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



