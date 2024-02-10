package com.OrangeHRMAutomation.QA.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedMethod {
    
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
       System.out.println(" status of box  "+searchbox.isDisplayed());
       System.out.println(" status of box  "+searchbox.isEnabled());
       System.out.println(searchbox.getText());
       WebElement gettext=driver.findElement(By.xpath("//select[@id='customerCurrency']"));
       gettext.click();
       System.out.println(gettext.isSelected());
       driver.quit();
	}

}
