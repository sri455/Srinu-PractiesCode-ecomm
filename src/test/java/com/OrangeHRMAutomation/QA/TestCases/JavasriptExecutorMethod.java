package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavasriptExecutorMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		     // WebElement element=(WebElement)js.executeScript("retun document.getElementById('email').value='srinu';");
		    		  js.executeScript("document.getElementById('email').value='srinu.banoth04@gmail.com';");
		    		  Thread.sleep(2000);
		    		  
		              //js.executeScript(document.getElementByID('password').

	}

}
