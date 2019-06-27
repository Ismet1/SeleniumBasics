package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

/*
 *TC 1: Table headers and rows verification
 *1.Open chrome browser
 *2.Go to “https://jqueryui.com/”
 *3.Click on “Datepicker”
 *4.Select August 10 of 2019
 *5.Verify date “08/10/2019” has been entered succesfully
 *6.Close browser
 */
public class TaskLast01 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
	setUpDriver("chrome", "https://jqueryui.com/");
	
	driver.findElement(By.cssSelector("a[href*='https://jqueryui.com/date']")).click();
	
	
	WebElement frame= driver.findElement(By.cssSelector("iframe.demo-frame"));
	driver.switchTo().frame(frame);
	
	WebElement textBox = driver.findElement(By.cssSelector("input#datepicker"));
	textBox.click();
	
	for(int i=0; i<3; i++) {
	WebElement arrow=driver.findElement(By.cssSelector("span[class^='ui-icon ui-icon-circle-triangle-e']"));
	arrow.click();
	}
	
	
	driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();
	
	Thread.sleep(5000);
	WebElement textBox1 = driver.findElement(By.cssSelector("input#datepicker"));
	String date=textBox1.getAttribute("value");
	String expDate = "08/10/2019";
	
	if(date.equalsIgnoreCase(expDate)) {
		System.out.println("Date is correct");
	}else {
		System.out.println("Check the date again");
	}
	
	Thread.sleep(2000);
	driver.close();
		
	}

}
