package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickOperation 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		WebElement DropdownMenu=  driver.findElement(By.xpath("//div[@id = 'div-context']"));
		Actions act=new Actions(driver);
		act.contextClick(DropdownMenu).perform();
		WebElement python = driver.findElement(By.xpath("//a[text() = 'Python']")); 
		act.click(python).perform(); 

		System.out.println("Right-clicked Successfully on Context menu");
		Alert alts= driver.switchTo().alert();
		String gettext= alts.getText();
		System.out.println(gettext);
		alts.accept();
		driver.close();
	}

}
