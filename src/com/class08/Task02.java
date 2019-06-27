package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task02 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		Task Two
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Handle the drag and drop
Close the browser
		 */
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		WebElement clickActions = driver.findElement(By.cssSelector("a[href='/Students/Actions']"));
		Actions action= new Actions(driver);
		action.moveToElement(clickActions).click().perform();
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
