package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) throws InterruptedException {
		//class attribute icin "." kullanilir. id attribute icin "#" kullanilir.
		//normal cssSelector yolu hepsi icin  kullanilir. input[type='text']

		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
	}

}
