package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPracties 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        
        driver.navigate().refresh(); // accepts nothing as a parameter and returns nothing. 
        System.out.println("Refresh is successfully"); 
       
	}
}


