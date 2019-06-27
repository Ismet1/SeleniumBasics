package com.class03;
/*
 * Mercury Tours Registration:
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) {
		//Note: rakam iceren tum html codelari dynamic olur ve could change anytime so u can get error next day

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Thedavid");
		driver.findElement(By.name("lastName")).sendKeys("Beckham");
		driver.findElement(By.name("phone")).sendKeys("5101101010");
		driver.findElement(By.id("userName")).sendKeys("ismetinal35@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("24 Main st.");
		driver.findElement(By.name("city")).sendKeys("famous city");
		driver.findElement(By.name("state")).sendKeys("LA");
		driver.findElement(By.name("postalCode")).sendKeys("07011");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		driver.findElement(By.name("email")).sendKeys("ThedavidBeckham");
		driver.findElement(By.name("password")).sendKeys("Syntax2019");
		driver.findElement(By.name("confirmPassword")).sendKeys("Syntax2019");
		driver.findElement(By.name("register")).click();
	}

}
