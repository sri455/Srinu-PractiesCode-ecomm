package com.OrangeHRMAutomation.QA.TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiplWindowHandal 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String ParentWindowHandal=driver.getWindowHandle();
		System.out.println("the parent window handal is "+ParentWindowHandal);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> multipleWindowHandals= driver.getWindowHandles();
		for(String singleWindowHandal:multipleWindowHandals)
		{
			if(!(singleWindowHandal.equals(ParentWindowHandal)))
			{
				driver.switchTo().window(singleWindowHandal);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys(" name is text");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.close();

			}
		}
	}

}


