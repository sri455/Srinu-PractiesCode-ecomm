package com.OrangeHRMAutomation.QA.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvederExp2 
{  
	@Test(dataProvider="userdata")
	public void datauser(String username,String pws)
	{		
		System.out.println("userName "+username);
		System.out.println("password  "+pws);		
	}
	@DataProvider(name="userdata")
	public Object[][] StoreData()
	{
	 Object[][] infor =new Object[3][2];
	 infor[0][0]="username1 Ravi";
	 infor[0][1]="paswrd data";
	 infor[1][0]="username2 ramu";
	 infor[1][1]="paswrd data2 ";
	 infor[2][0]="username3 kiran";
	 infor[2][1]="paswrd data3";
	 return infor;
}

}
