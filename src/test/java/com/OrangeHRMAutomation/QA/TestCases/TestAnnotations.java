package com.OrangeHRMAutomation.QA.TestCases;

import org.testng.annotations.Test;

public class TestAnnotations 
{
  @Test(timeOut=5000)
  public void FirstMethod() throws InterruptedException
  { 
	  Thread.sleep(1000);
	  System.out.println("1ST method ");
  } 
  @Test(timeOut=4000)
  public void SecondMethod()throws InterruptedException
  {
	  Thread.sleep(500);
	  System.out.println("2an method ");
  }
  @Test
  public void thirdMethod()
  {
	  System.out.println("SecondMethod ");
  } 
  @Test
  public void FourthMethod()
  {
	  System.out.println("4th method ");
  }
}
