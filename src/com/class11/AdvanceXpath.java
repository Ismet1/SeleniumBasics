package com.class11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class AdvanceXpath extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//Eger xpath yada cssSelector yaparken, element unigue degilse! parent/sibling yontemlerini uygulayarak, elementi unique hale
		//getiriyorsun. Slayttan formullerine bak.

		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome",url);
		
		driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Password']/../input")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		
	}

}
