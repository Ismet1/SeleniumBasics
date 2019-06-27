package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		/*
 * Check all Years of Experience radio buttons are clickable
* -----------------------------------------------
* Check all Automation Tools checkboxes are clickable
* and keep “Selenium WebDriver” option as selected
		 */

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> alist = driver.findElements(By.name("exp"));
		for (WebElement alist1 : alist) {			
			System.out.println(alist1.isEnabled());
		}
	
		List<WebElement> blist = driver.findElements(By.name("tool"));
		for (WebElement blist1 : blist) {			
			System.out.println(blist1.isEnabled());
		}
		
		
}
}