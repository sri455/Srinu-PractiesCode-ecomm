package com.OrangeHRMAutomation.QA.TestCases;

import org.testng.annotations.Test;

public class GropingTestMethods 
{
  @Test(groups= {"Cricket player"},priority=1)
  public void Player2()
  {
	 System.out.println("Rohith Sharma "); 
  }
  @Test(groups= {"Cricket player"},priority=2)
  public void Player3()
  {
	 System.out.println("virat Kohli" ); 
  }
  @Test(groups= {"Cricket player"},priority=4)
  public void Player4()
  {
	 System.out.println("Reshab panth "); 
  }
  @Test(groups= {"Cricket player"},priority=3)
  public void Player5()
  {
	 System.out.println("Surya Kumar "); 
  }
  @Test(groups= {"Cricket player","exclude-group"})
  public void Player6()
  {
	 System.out.println("Mahamad Sami "); 
  }
  @Test(groups= {"Cricket player"},priority=0)
  public void Player1()
  {
	 System.out.println("KL Rahul "); 
  }
}
