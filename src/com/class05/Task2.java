package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC 2: Swag Labs Negative login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”
 */
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_us");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sa");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String value = errorMsg.getText();
		String expectedValue = "Username and password do not match any user in this service";
		if(value.contains(expectedValue)){
		System.out.println("Error Message contains the expected sentence");	
		} else {
			System.out.println("not contains");
		}
	}

}
