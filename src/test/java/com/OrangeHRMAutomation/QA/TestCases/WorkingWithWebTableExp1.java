package com.OrangeHRMAutomation.QA.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.OrangeHRMAutomation.QA.BaseClass.BaseClass2;

public class WorkingWithWebTableExp1 extends BaseClass2 
{
  @Test(priority=0)
  public void LunchApp() 
  {
	driver.get("https://www.demo.guru99.com/test/web-table-element.php/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  @Test(priority=1 )
  public void webtablesGetNumberOfRows()
  {
	  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	  int numberOfRows = rows.size();
	  System.out.println("Number of rows in the given table are "+numberOfRows);
	  for(int i = 0;i<rows.size();i++)
	  {
		String dataInTheRow = rows.get(i).getText();
		System.out.println(dataInTheRow);
		System.out.println("**************************************************");
	  }
	}

  @Test(priority=2)
  public void webtableGetNumberOfColumnsInARow()
  {
  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	// above is dynamic xpath for rows
	for(int i=0;i<rows.size();i++)
	{
		// dynamic xpath for columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr["+i+"]//td"));
		for(int j=0;j<columns.size();j++)
		{
			String columnData = columns.get(j).getText();
			System.out.println("Data from RowNumber "+ i +" and Column Number "+ j +" is "+columnData);
			System.out.println("***********************************");
		}
	}
}


}

