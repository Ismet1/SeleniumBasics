package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

/*
 TC 1: Users Application Form Fill
 1.Open chrome browser
 2.Go to “http://uitestpractice.com/”
 3.Click on “Forms” link
 4.Fill out the entire form
 5.Close the browserMUST USE Functions:
 */
public class TaskLast02 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUpDriver("chrome", "http://uitestpractice.com/");
		
		driver.findElement(By.linkText("Form")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("ISMET");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("INAL");
		driver.findElement(By.cssSelector("body > div.container.body-content > div:nth-child(1) > div > form > div:nth-child(3) > label:nth-child(3) > input[type=radio]")).click();
		
	}

}
