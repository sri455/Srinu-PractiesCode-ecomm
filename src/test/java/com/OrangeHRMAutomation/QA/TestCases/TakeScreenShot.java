package com.OrangeHRMAutomation.QA.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		 File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		 File destFile=new File("D:\\SeleniumWorkes\\OrangeHRMAutomation\\Screenshoot02.png");
		 FileUtils.copyDirectory(sourceFile, destFile);
		 System.out.println("screenshoot saved successfuly");
		 driver.quit();

	}

}
