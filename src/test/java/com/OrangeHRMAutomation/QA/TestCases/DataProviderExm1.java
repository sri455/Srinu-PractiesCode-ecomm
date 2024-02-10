package com.OrangeHRMAutomation.QA.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExm1<retuns> {

    @Test(dataProvider="DataProvider")
	public void logInPage (String textentry) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(textentry);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_8d gb_8c']")).isDisplayed());
		Thread.sleep(5000);
		driver.quit();
	}
	@org.testng.annotations.DataProvider()
	public Object[] DataProvider()
	{
		Object[] data=new Object[5];
		data[0]="softwears";
		data[1]="webdriver";
		data[2]="cricket";
		data[3]="education";
		data[4]="telugu heros";
		return data;
	}
}



