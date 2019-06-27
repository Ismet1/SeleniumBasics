package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task03 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
	Task Three
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click and hold on 1,2,3,4 boxes
Close the browser
		 */
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		
		WebElement clickActions = driver.findElement(By.cssSelector("a[href='/Students/Actions']"));
		Actions action= new Actions(driver);
		action.moveToElement(clickActions).click().perform();
		Thread.sleep(2000);
		
		
		WebElement box1 = driver.findElement(By.cssSelector("li[name='one']"));
		WebElement box2 = driver.findElement(By.cssSelector("li[name='two']"));
		WebElement box3 = driver.findElement(By.cssSelector("li[name='three']"));
		WebElement box4 = driver.findElement(By.cssSelector("li[name='four']"));
		action.clickAndHold(box1).perform();
		Thread.sleep(2000);
		action.clickAndHold(box2).perform();
		Thread.sleep(2000);
		action.clickAndHold(box3).perform();
		Thread.sleep(2000);
		action.clickAndHold(box4).perform();
		
		Thread.sleep(2000);
		driver.close();
		
		
		//Hocanin yaptigi
		/*
			setUpDriver("Chrome","http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one = driver.findElement(By.xpath("//li[text()='1']"));
		WebElement two = driver.findElement(By.xpath("//li[text()='2']"));
		WebElement three = driver.findElement(By.xpath("//li[text()='3']"));
		WebElement four = driver.findElement(By.xpath("//li[text()='4']"));
		Actions action = new Actions(driver);
		action.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold().moveToElement(four).build().perform();

		 */
	}

}
