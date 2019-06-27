package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon
 */
public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		//benim yaptigim
	/*	
		System.setProperty("webdriver.chrome.driver", "\\Users\\ismet\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		boolean isDisplayed = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		boolean isDisplayed1 = driver.findElement(By.cssSelector("//div[text()='Products']")).isDisplayed();
		if (isDisplayed && isDisplayed1) {
			System.out.println("Robot icon is displayed");
		} else {
			System.out.println("Robot icon is NOT displayed");
		}
		
		//hocanin yaptigi
*/
	
	String userName="standard_user";
	String password="secret_sauce";
	
	System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.saucedemo.com/");
	//login to the application
	driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys(userName);
	driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys(password);
	driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
	//logo verification
	boolean logo=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
	
	if (logo) {
		System.out.println("Robot logo is displayed");
	}else {
		System.out.println("Robot logo is NOT displayed");
	}
	//verify product text
	WebElement product=driver.findElement(By.cssSelector("div.product_label"));
	boolean displayP=product.isDisplayed();
	String productText=product.getText();
	
	String expectedText="Products";
	
	if (displayP && productText.equals(expectedText)) {
		System.out.println("Element is displayed and texts is "+productText);
	}else {
		System.out.println("Element is NOT displayed OR textis NOT="+productText);
	}
	}

}
