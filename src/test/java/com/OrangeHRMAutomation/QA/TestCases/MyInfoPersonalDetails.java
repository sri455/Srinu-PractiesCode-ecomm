package com.OrangeHRMAutomation.QA.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class MyInfoPersonalDetails extends BaseClass2
{
	@Test
	public void verifyPersonalDetailsByDefaultUnEditable() 
	{
		String firstName = "//input[@id='personal_txtEmpFirstName' and @title='First Name']";
		String val = driver.findElement(By.xpath(firstName)).getAttribute("class");
		System.out.println("Value of class = "+val);
		// Assert.assertEquals(val, "block default editable", "The field first name is editable. So Please raise a defect");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(val, " block default editable", "The field first name is editable. So Please raise a defect");
		sa.assertNotNull(sa, " ");
		//  File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		//The web driver object is converted to TakeScreenshot
		TakesScreenshot sh = (TakesScreenshot)driver;
		File f = sh.getScreenshotAs(OutputType.FILE);

		try 
		{
			FileUtils.copyFile(f, new File("C:\\Users\\Prathap\\OneDrive\\Desktop\\Batch\\SPB3Maven\\OrangeHRMAutomation\\screenshot01.png"));
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After assert line 1");
		System.out.println("After assert line 2");
		System.out.println("After assert line 3");
		System.out.println("After assert line 4");
		sa.assertAll("All my assertions are executed");
	}




}



