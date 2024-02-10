package com.OrangeHRMAutomation.QA.TestCases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass1;
import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class OpenApplication extends BaseClass1
{
	@Test
	public void LunchAPP(Timeouts loginLink)
	{
		try 
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Assert.assertEquals(loginLink, false, "login successful");
		}
		catch(NoSuchElementException obj)
		{
			System.out.println(obj.getMessage());
		}
		catch(Throwable obj) 
		{
			System.out.println(obj.getMessage());
		}
	}
	@SuppressWarnings("deprecation")
	@Test		
	public void login()
	{
		boolean loginLink=false;
		try 
		{
			driver.findElement(By.id("divUsername")).click();
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			try 
			{
				driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
			}

			catch(ElementNotInteractableException obj)
			{
				System.out.println(obj.getMessage());
			}
			catch(NoSuchElementException obj)
			{
				System.out.println(obj.getMessage());
			}
			catch(Throwable obj)
			{
				System.out.println(obj.getMessage());  
			}
			System.out.println("welcome link avialable status is  "+loginLink);
			System.out.println("print the  59th line");
			System.out.println("print the 60th line");
		}
		catch(ElementNotInteractableException obj)
		{
			System.out.println(obj.getMessage());
		}
		catch(NoSuchElementException obj)
		{
			System.out.println(obj.getMessage());
		}
		catch(Throwable obj)
		{
			System.out.println(obj.getMessage());  
		}

	}
}






