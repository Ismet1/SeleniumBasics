package com.class03;
/*
Facebook login:
Open chrome browser
Go to “https://www.facebook.com/”
Enter valid username and valid password and click login
User successfully logged in
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		//Note: rakam iceren tum html codelari dynamic olur ve could change anytime so u can get error next day
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("ismetinal35@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Syntax2019");
		
		driver.findElement(By.id("u_0_2")).click();
		
		
	}

}
