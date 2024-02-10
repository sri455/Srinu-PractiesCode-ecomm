package com.OrangeHRMAutomation.QA.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DtaProviderexp2
{   @Test(dataProvider="user data")
	public void userDataProvider(String username,String id)
	{  
	     int i=1;
		System.out.println(" "+username);
		System.out.println(" "+id);
		System.out.println("i of "+i);
		i=i+1;
		System.out.println("****************");
	}
@DataProvider(name="user data")	
public Object[][] userData()
{
	Object[][] inf=new Object[4][2];
	inf[0][0]="name srinu";
	inf[0][1]="id Ec45";
	inf[1][0]="name kiran";
	inf[1][1]="id Ec444";
	inf[2][0]="name ragu";
	inf[2][1]="id Ec345";
	inf[3][0]="name sundeep";
	inf[3][1]="id Ec342";
	return inf;
	
}
}
