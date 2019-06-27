package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadAndImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Thread.sleep ile ayni sey, 30 saniye bekletcek bu sekilde //bu page'in yuklenmesi icin
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //bu tum elemntler icin.(global) exception vercek br islem yapiyosak 20sn veriyor.
		
		driver.get("http://cnn.com");
		
		driver.findElement(By.linkText("World")).click();
		
		boolean isDisplayed=driver.findElement(By.xpath("//h1[text()='World']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is NOT present");
		}
		driver.quit();
	}

}
