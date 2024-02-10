package com.OrangeHRMAutomation.QA.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;
public class NavigateTo extends BaseClass2
{
  @Test
  public void NavigateTo() 
  {
	 String myInfoXpath = "//a[@id='menu_pim_viewMyDetails']//b[@contains(text(),'My Info']";
	  driver.findElement(By.xpath(myInfoXpath)).click();  
  }
}
