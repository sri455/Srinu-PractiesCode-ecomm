package com.OrangeHRMAutomation.QA.TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class WorkingWithAlertsPopupsExmpl extends BaseClass2
{
  @Test(priority=0)
  public void LunchApplication()
  {
	  driver.get("https://demoqa.com/alerts");
	  //driver.get("driver.get(\"https://demoqa.com/alerts\");");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
	  @Test	(priority=1)  
	  public void HandleAlert() throws InterruptedException
	  {
		  try 
		  {
		driver.findElement(By.xpath("//div[@class='col']//button[@id='alertButton']and (contains(text,'click me')]")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		//Scrolling down the page till the element is found	
		Js.executeScript("arguments[0].scrollIntoView();",ele);
		ele.click();
		String textOnAlert=driver.switchTo().alert().getText();
		// getText() method will get the text present on the alert

		System.out.println("text from the alert is  "+textOnAlert);
		driver.switchTo().alert().dismiss();
		//dismiss() method will click on Cancel button or dismiss button present on a alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("SRINU");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();		
	  }
	  catch(NoAlertPresentException obj)
	  {
			 String exceptionMessage =  obj.getMessage();
			 System.out.println("An exception did occur with message ---- "+exceptionMessage);
  
	  }
	  catch(Throwable obj)
	  {
		  String exceptionMessage =  obj.getMessage();
		  System.out.println("An exception did occur with message ---- "+exceptionMessage);
	  }

  }
}
