package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name='firstname']")).sendKeys("name");
		driver.close();
		*/
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
	}

}
