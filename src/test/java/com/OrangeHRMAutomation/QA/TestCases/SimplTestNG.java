package com.OrangeHRMAutomation.QA.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SimplTestNG
{
  @Test
  public void ExceuteTest1() 
  {
	System.out.println(" ExceuteTest1");  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println(" before Method");  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println(" after Method"); 
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println(" before Class"); 
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println(" after Class");  
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println(" before Test");  
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println(" after Test"); 
  }

}
