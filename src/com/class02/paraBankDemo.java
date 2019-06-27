package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBankDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.name("customer.firstName")).sendKeys("bob");//id locator'in yanindaki ifadeyi alir "findElement" methoduna yerlestirirz
        Thread.sleep(2000);
       driver.findElement(By.name("customer.lastName")).sendKeys("tom");//name locator'da da olur. Genelde id'den sonraki o linedaki tum variablelar olablr
        Thread.sleep(2000);
       driver.findElement(By.name("customer.address.street")).sendKeys("123 street");//sendKeys ilede data gonderilir
        Thread.sleep(2000);
       driver.findElement(By.id("customer.address.city")).sendKeys("Asel town");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.address.state")).sendKeys("Va"); 
       Thread.sleep(2000);
       driver.findElement(By.name("customer.address.zipCode")).sendKeys("07010");
       Thread.sleep(2000);
       driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.username")).sendKeys("arif1");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.password")).sendKeys("arif10");
        Thread.sleep(2000);
       driver.findElement(By.id("repeatedPassword")).sendKeys("arif10");
        Thread.sleep(2000);
       driver.findElement(By.className("button")).click();
       
       
   

	}
}
