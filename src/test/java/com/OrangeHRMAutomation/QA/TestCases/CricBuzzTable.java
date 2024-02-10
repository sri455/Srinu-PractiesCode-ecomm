package com.OrangeHRMAutomation.QA.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CricBuzzTable
{
	public static String BrowserName="MicrosoftEdge";
	public static WebDriver driver;
@Test
   public void LaunchWebTable() 
{
	  WebDriverManager.chromedriver().setup();
	 driver =  new ChromeDriver();
	 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/47309/ned-vs-pak-3rd-odi-rescheduled-match-pakistan-tour-of-netherlands-2022");
	 driver.manage().window().maximize();
}
@Test(priority=0)
   public void xpathAccess()
   {
	String Xpathname=driver.findElement(By.xpath("//a[@title='View profile of Shafique' and contains(text(),' Shafique ')]")).getText();
    System.out.println("Name of the Person   "+Xpathname);
    
    String Caughtperson=driver.findElement(By.xpath("(//a[contains(text(),' Shafique ')]/parent::div[@class='cb-col cb-col-27 ']"
    		+ "/following-sibling::div)[1]")).getText();
    System.out.println("The person who caught the ball: "+Caughtperson);
    
    String Runs=driver.findElement(By.xpath("(//a[contains(text(),' Shafique ')]/parent::div[@class='cb-col cb-col-27 ']"
    		+ "/following-sibling::div)[2]")).getText();
    System.out.println("No.of Runs:"+Runs);
    
    
    String Balls=driver.findElement(By.xpath("(//a[contains(text(),' Shafique ')]/parent::div[@class='cb-col cb-col-27 ']"
    		+ "/following-sibling::div)[3]")).getText();
    System.out.println("No.of Balls:  "+Balls);
    
    }
@Test
(priority=1)
  public void xpathAccessMain()
  {
	  String playerName="Nawaz";
	String xpathname=driver.findElement(By.xpath("(//a[contains(text(),' "+playerName+" ')]/parent::div[@class='cb-col cb-col-27 ']/following-sibling::div)[2]")).getText();
	System.out.println("No. of Runs: "+xpathname);
  }
  }
