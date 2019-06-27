package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Open chrome browser
Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
Verify
alert box with text “I am an alert box!” is present
confirm box with text “Press a button!” is present
prompt box with text “Please enter your name” is present
Quit browser
 */
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		String expectedValueAlert= "I am an alert box!";
		String expectedValueConfirm= "Press a button!";
		String expectedValuePrompt= "Please enter your name";
		
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		String gottenValue=alert.getText();
		
		if(gottenValue.contains(expectedValueAlert)) {
			System.out.println("Verified for alert box");
		}else {
			System.out.println("Unverified for alert box");
		}
		alert.accept();
		
		
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		Alert alert1=driver.switchTo().alert();
		String gottenValue1=alert.getText();
		
		if(gottenValue1.contains(expectedValueConfirm)) {
			System.out.println("Verified for confirm box");
		}else {
			System.out.println("Unverified for confirm box");
		}
		alert1.accept();
		
				
		driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
		Alert alert2=driver.switchTo().alert();
		String gottenValue2=alert.getText();
		
		if(gottenValue2.contains(expectedValuePrompt)) {
			System.out.println("Verified for prompt box");
		}else {
			System.out.println("Unverified for prompt box");
		}
		alert2.accept();
	}

}
