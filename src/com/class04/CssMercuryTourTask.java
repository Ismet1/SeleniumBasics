package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssMercuryTourTask {

	public static void main(String[] args) {
		/*
 TC 1: Mercury Tours Registration:
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered

		 */
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.cssSelector("a[href^='mercuryregister']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Thedavid");
		driver.findElement(By.cssSelector("input[name$='astName']")).sendKeys("Beckham");
		driver.findElement(By.cssSelector("input[name*='hon']")).sendKeys("5101101010");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("ismetinal35@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("24 Main st.");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("famous city");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("LA");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("07011");
		driver.findElement(By.cssSelector("select[name='country']")).sendKeys("UNITED STATES");
		driver.findElement(By.cssSelector("input#email")).sendKeys("ThedavidBeckham");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Syntax2019");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("Syntax2019");
		driver.findElement(By.cssSelector("input[name^='re']")).click();
	}

}
