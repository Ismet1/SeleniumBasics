package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		 Task for hoverOver
//         Navigate to https://www.toolsqa.com
//             Hover over the Tutorial menu
//             Click on Software Testing Tutorial
//             Close the browser
		 */
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions action= new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		Thread.sleep(2000);
		WebElement hoverOver1 = driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']"));
		action.moveToElement(hoverOver1).click().perform();
		Thread.sleep(2000);
		//driver.close();
		
		
		

	}

}
