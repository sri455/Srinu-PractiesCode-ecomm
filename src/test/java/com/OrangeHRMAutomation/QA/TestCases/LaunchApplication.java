package com.OrangeHRMAutomation.QA.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class LaunchApplication extends BaseClass2
{
	@Test
	public void launchapp()
	{
		try
		{
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		catch(Throwable object)
		{
			System.out.println(object.getMessage());
		}

	}
	@Test
	public void loginApplication() 
	{
		boolean Loginlink=false;


		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("spb3testing@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).click();
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try
		{
			Loginlink = driver.findElement(By.xpath("//a[@title='Women']")).isDisplayed();
			System.out.println("Displayed");
			Assert.assertEquals(Loginlink, true, "Raise a defect"); //hard assert
		}
		catch(Throwable object)
		{
			System.out.println(object.getMessage());
			SoftAssert sa=new SoftAssert();//soft assert
			Assert.assertEquals(Loginlink, true, "Raise a defect");
			sa.assertAll(); 
		}

	}
	@Test  
	public void homepage() 
	{


		driver.findElement(By.xpath("//a[@class='sf-with-ul' and text()='Women']")).click();
		driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
	}
	@Test
	public void screenshot()
	{
		TakesScreenshot sh=(TakesScreenshot)driver;
		File f = sh.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(f, new File("D:\\SeleniumWorkes\\OrangeHRMAutomation\\Screenshoot02.png"));
			//FileUtils.copyFile(f, new File("F:\\SeleniumWorkSpace\\YourLogo\\Screenshot01.png"));
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}

	}

	@Test
	public void logout()
	{
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
	}
}

