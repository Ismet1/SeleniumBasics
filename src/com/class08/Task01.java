package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task01 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
	Task One
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click on the click me !
Handle the alert and click okay
Double Click Double Click Me !
Handle the alert and click okay
Close the browser
		 */		
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		WebElement clickActions = driver.findElement(By.cssSelector("a[href='/Students/Actions']"));
		Actions action= new Actions(driver);
		action.moveToElement(clickActions).click().perform();
		WebElement clickMe = driver.findElement(By.cssSelector("button[name='click']"));
		action.moveToElement(clickMe).click().perform();
		
		
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		action.doubleClick(driver.findElement(By.cssSelector("button[name='dblClick']"))).perform();
		
		Thread.sleep(2000);
		alert.accept();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
