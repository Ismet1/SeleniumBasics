package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review_09 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		
		//-----------------------------------------------Synchronization-----------------------------------------------------//
		
		
		//-----------------pageLoad---------------------//
		
		// Page load timeout in selenium requests/set the time limit for a page to load.
		//Page Load timeout is applicable only to driver.get() and driver.navigate().to() methods in selenium webdriver
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//sayfanin yuklenmesi icin 30 saniye verdik
		driver.get("http://cnn.com");
		
		
		
		//----------------Implicit----------------------//
		
		//Selenium provides two type of wait. Implicit wait and explicit wait("webdriver wait")(also "fluent wait" but not often)
		//Implicit wait: ell WebDriver to poll the HTML DOM for a certain amount of time when trying to find an element or elements if they are not immediately available. 
		//It will work only for "FindElement" and "FindElements" statements.

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Bu sekilde codeluyoruz.
		driver.findElement(By.linkText("World")).click(); //sadece findElement/findElements ile calisiyor.
		
		
		
		//---------------Explicit(WebDriver)------------------------//
		
		//Explicit wait is mostly used when we need to Wait for a specific content
		//If the Webdriver finds the element within the timeout period the code will get executed.
		//Type of expected condititon in explicit wait.
		// @elementToBeClickable() @visibilityOfElementLocated() @elementToBeSelected() @textToBePresentInElement() @alertIsPresent()
		//if these command's answers are negative then gives "TimeOutException"
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		
		boolean isDisplayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is NOT present");
		}
		
		
		
		//----------------------Fluent Wait-----------------------//
		
		//same with explicit wait.
		
//		FluentWait wait = new FluentWait(driver);    //initiate'ini yapiyoruz
//		wait.withTimeout(45, TimeUnit.SECONDS);	     //kac saniye beklencegi yaziliyor
//		wait.pollingevery(5, TimeUnit.SECONDS);	     //ne kadarda bir check etmesi gerektigi soyleniyor
//		wait.ignoring(NoSuchElementException.class); //exception vermesin diye bu code yaziliyor.
	}

}
