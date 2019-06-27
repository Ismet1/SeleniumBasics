package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		WebElement ele = driver.findElement(By.name("iframe_a"));
		driver.switchTo().frame(ele);
		driver.findElement(By.cssSelector("input#name")).sendKeys("ismet");
		
	}

}
