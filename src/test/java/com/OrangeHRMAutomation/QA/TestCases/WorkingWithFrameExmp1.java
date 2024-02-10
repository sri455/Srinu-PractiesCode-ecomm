package com.OrangeHRMAutomation.QA.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class WorkingWithFrameExmp1 extends BaseClass2
{
	@Test(priority=0)
	public void LunchApplication()

	{
		driver.get(prop.getProperty("hyrFrameUrl"));
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("waitTime")), TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void FindFramesCount() throws InterruptedException
	{
		JavascriptExecutor fsh=(JavascriptExecutor)driver; 
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frame are "+frames.size());
		for(int i=0;i<frames.size();i++)
		{
			fsh.executeScript("arguments[0].style.border='2px solid green'", frames.get(i));
			Thread.sleep(3000);
		}
	}
	@Test(priority=2)
	public void GetAccessToframesByIndex() throws InterruptedException
	{
		JavascriptExecutor jse=	(JavascriptExecutor)driver;
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		System.out.println("No of frame are "+frames.size());
		for(int i=0;i<frames.size();i++)
		{
			jse.executeScript("arguments[0].style.border='2px solid red'", frames.get(3));
			Thread.sleep(3000);
		}	
	}@Test(priority=3)
	public void GetAccessToFramesByIndexID() throws InterruptedException
	{
		driver.switchTo().frame("frm1");
		String CouresDropDownXpath="//div[@class='tm-menu']//ancestor::div[@id='body-wrapper' and @style='height: auto !important;']//descendant::div[@class='header-wrap']//following-sibling::div//descendant::select[@id='course']";
		WebElement CouresDropDown=driver.findElement(By.xpath(CouresDropDownXpath));
		Select sel=new Select(CouresDropDown);
		sel.selectByValue("java");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		String Frame1_Xpath="//div[@class='post-body entry-content']//ancestor::div[@id='main-wrapper' and @style='position: relative; overflow: visible; box-sizing: border-box; min-height: 1px;']//child::iframe[@id='frm1']";
		WebElement wb = driver.findElement(By.xpath(Frame1_Xpath));
		driver.switchTo().frame(wb);
		sel.selectByVisibleText("Dot Net");
	}
	@Test(priority=4,enabled=false)
	public void getAccessToFrameByXpath() throws InterruptedException
	{
		Thread.sleep(3000);
		String frame1_Xpath = "//div[@class='post-body entry-content']//ancestor::div[@id='main-wrapper' and @style='position: relative; overflow: visible; box-sizing: border-box; min-height: 1px;']//child::iframe[@id='frm1']";
		WebElement ele = driver.findElement(By.xpath(frame1_Xpath));
		driver.switchTo().defaultContent();
		
	}

}


