package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.CommonMethods;
/*
 * TC 1: OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file
 */
public class Task1 extends CommonMethods{

Properties prop;
	
	@Test
	public void readFile() throws InterruptedException {
		
		String filePath="src/configs/credentials.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		Thread.sleep(2000);
		
		
		String username =  prop.getProperty("username");//bu verinin icindeki mavi "username" file'dan gelen username
        System.out.println(username); //bunun taskta bir gorevi yok. kahverengi username bizim bu class'ta olusturdugumuz username.
        //bunu olusturuyoruzki "commonmethod'tan oulsturdugumuz "driver" classta kullanabilelim.
        //file class'ta ousturdugumuz variable'i direk burda kullanamiyoruz cunku.
        String password =  prop.getProperty("password");
        System.out.println(password);
        sendText(driver.findElement(By.id("txtUsername")), username);
        sendText(driver.findElement(By.cssSelector("#txtPassword")), password);
        driver.findElement(By.cssSelector(".button")).click();
        String expectedText =  prop.getProperty("expectedText");
        System.out.println(expectedText);
        if(driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText().equals(expectedText)) {
            System.out.println("Text match login successful");
        }else {
            System.out.println("Text do not match login failed");
        }    
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText()); //bu kismi sitenin veridigi login msjinin ne oldugunu
		//gormek icin yazdim.
		
		//CommonMethods.driver.quit();
	}
}

