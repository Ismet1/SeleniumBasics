package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		/*
 TC 1: ToolsQA Frame verification
Open chrome browser
Go to “https://www.toolsqa.com/iframe-practice-page/”
Click on “Guest Blogs” link inside first frame
Verify element “Interactions” is present in second frame
Navigate to Home Page
Quit browser
		 */		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		//Bu iki satiri comment ettim cunku "Guest Blogs" acilmadi. acilmadigi icin baska linke tikalama komutu verdim. O da baska bir Tab acti
		//Bask bir tab acincada Task'in ikinci kismini yapamaz durumu geldik. Taska devam edebilmek icin bu kismi comment ettim.
//		driver.switchTo().frame(0);
//		driver.findElement(By.cssSelector("div.single-share-box")).click();	
		Thread.sleep(5000);
		
		driver.switchTo().frame(1);
		Thread.sleep(20000);
		boolean present = driver.findElement(By.xpath("//h3[contains(text(),'Interactions')]")).isDisplayed();
		if(present) {
			System.out.println("Interactions is present");
		}else {
			System.out.println("Interactions is missing");
		}
		
		driver.switchTo().defaultContent();	
		driver.quit();
	}
}
