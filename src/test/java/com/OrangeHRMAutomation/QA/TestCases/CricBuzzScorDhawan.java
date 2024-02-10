package com.OrangeHRMAutomation.QA.TestCases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricBuzzScorDhawan 
{
	public static WebDriver driver;
  @Test(priority=0)
  public void LunchApp() 
  {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/47309/ned-vs-pak-3rd-odi-rescheduled-match-pakistan-tour-of-netherlands-2022");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  @Test(priority=1)
  public void DhawanScor()
  {
	  String DhawanRuns=driver.findElement(By.xpath("//a[contains(text(),' Dhawan')]/parent::div[@class='cb-col cb-col-27 ']/following-sibling::div[2]")).getText();
	  System.out.println("Dhawan scored runs "+DhawanRuns);
	  String ballFaced=driver.findElement(By.xpath("//div[@class='cb-col cb-col-27 ' ]/child::a[contains(text(),' Babar Azam (c) ')]/following::div [@class='cb-col cb-col-8 text-right text-bold' and contains(text(),'91')]")).getText();
	  System.out.println("Dhawan faced balls  "+ballFaced);
  }
}
