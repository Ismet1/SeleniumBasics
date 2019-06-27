package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task01 extends CommonMethods {
/*
 TC 1: Table headers and rows verification

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Number of rows ="+rows.size());
		
		List <WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("Number of colums ="+cols.size());
		
		System.out.println("--------col-----------");
		for (WebElement col: cols) {
			String colText=col.getText();
			System.out.println(colText);
		}
		
		System.out.println("-------row-----------");
		for (WebElement row: rows) {
			String rowText=row.getText();
			System.out.println(rowText);
		}
		
	}

}
