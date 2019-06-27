package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class StaticWebTableDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-table/");
		
		//GET NUMBER OF ROWS  //Row diyince direk "tbody"e gidiceksin. ordan tr'yi bulucaksin. (row diyince aklina body'deki rowlar gelsin)
		List <WebElement> rows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
		System.out.println("Number of rows ="+rows.size());
		
		System.out.println("-----------ROW DATA-----------------");
		Iterator<WebElement> it=rows.iterator();
		while(it.hasNext()) {
			String rowText=it.next().getText();
			System.out.println(rowText);
		}
		
		//GET NUMBER OF COLUMNS //Columns diyince direk "thead"'e gidiceksin tr'nin icrsinden th'yi bulucaksin (column diyince aklina head'teki column gelsin)
		List <WebElement> cols=driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
		System.out.println("Number of colums ="+cols.size());
		
		System.out.println("-----------COLUMNS HEADERS-----------------");
		for (WebElement col: cols) {
			String colText=col.getText();
			System.out.println(colText);
			
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
