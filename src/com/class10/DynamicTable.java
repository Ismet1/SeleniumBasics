package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class DynamicTable extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
		
		//login to the application
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester"); //sendText = sendKeys
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		//get number of rows and cols
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		
		//Click on the checkbox next to "Susan McLaren"
		String expectedValue="Canada";
		
//		for (int i=1; i<=rows.size(); i++) { // i loop kullanarak row'lari parcaladik
//			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
//		
//			if(rowText.contains(expectedValue)) {
//				System.out.println(i);
//				driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[1]")).click();
//				
				
		for (WebElement row:rows) {
			String rowText= row.getText();
			
			if(rowText.contains(expectedValue)) {
				System.out.println(rowText);
			row.click();
		
				
			}
		}
		
		Thread.sleep(5000);
		//driver.quit();
		
	}

}
