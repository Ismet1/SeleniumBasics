package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class TestForCommand{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();
		WebElement countriesDD=driver.findElement(By.id("countriesMultiple"));
		CommonMethods.selectValueFromDD(countriesDD, "United states of America");
	}

}
