package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		/*
		TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
		 */

		
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click(); 
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click(); 
		
		Actions action= new Actions(driver); 
		WebElement hoverOver = driver.findElement(By.xpath("//button[text()='Start']")); 
		action.moveToElement(hoverOver).click().perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		
		boolean isDisplayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is NOT present");
		}
		driver.quit();
	}

}
