package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task02 extends CommonMethods {
/*
 TC 1: Table headers and rows verification

Open chrome browser
Go to �http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx�
Login to the application
Verify customer �Susan McLaren� is present in the table
Click on customer details
Update customers last name
Verify updated customers name is displayed in table
Close browser
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester"); 
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		
		String expectedValue="Susan McLaren";
		
		for (int i=1; i<=rows.size(); i++) { 
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[13]")).click();
			}
		}
		
		WebElement lastname = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName"));
		lastname.clear();
		lastname.sendKeys("Susan Inal");
		
		
	}

}
