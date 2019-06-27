package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://facebook.com");
		/*
		driver.findElement(By.id("email")).sendKeys("ismetinal35@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Syntax2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_login_button')]")).click();
		*/
		//---------------------------------Hocanin yaptigi------------------------------------------------//
		
		driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_pa')]")).sendKeys("Syntax123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
		
		//a[text()='Forgot account?']
		//a[starts-with(text(),'Forgot ')]
		//a[contains(text(),'account?')]
		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_pa')]")).sendKeys("Syntax123");
//		driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
		//driver.close();
		
	}

}
