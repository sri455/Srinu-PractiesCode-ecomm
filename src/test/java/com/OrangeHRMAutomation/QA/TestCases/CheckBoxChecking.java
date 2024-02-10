package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class CheckBoxChecking 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		driver.navigate().refresh(); // accepts nothing as a parameter and returns nothing. 
		System.out.println("Refresh is successfully"); 

	}
	@Test
	public void assertTrue()
	{
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='country']")); 
		Select MultiplChoice=new Select(dropDown);
		if(MultiplChoice.isMultiple())
		{
			System.out.println("select allowes multipel dropdown option ");
		}
		else
		{
			System.out.println("select not allowes multipel dropdown option ");  
		}

		MultiplChoice.selectByIndex(2);
		MultiplChoice.selectByIndex(3);
		MultiplChoice.selectByIndex(4);
		if(MultiplChoice.getAllSelectedOptions().size()==3)
		{
			System.out.println("MultiplChoice dropdown selected  ");
		}
		else
		{
			System.out.println("MultiplChoice dropdown not  selected  ");  
		}
		//Assert.assertEquals(MultiplChoice, "dropdown selected successfuly ");

	}
	@AfterMethod
	public void afterMethod() 
	{ 
		// driver.close(); 
	}
}

