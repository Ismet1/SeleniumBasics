package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// Bu ornekteki standart_user, secret_sauce, bilgilerini websitesinden aldik.Yani code degil
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.saucedemo.com");
	      driver.findElement(By.id("user-name")).sendKeys("standard_user");//id html console'undaki user-name butonuna gittigimizdeki attiributelerden biri
	      //id'nin hemen yanindaki "user_name ve password" gibi bilgileri websitesindeki html codingindeki id'nin hemen yaninda yer alan value!
	      
	      
	      Thread.sleep(2000);
	      driver.findElement(By.id("password")).sendKeys("secret_sauce");//id html console'undaki user-name butonuna gittigimizdeki attiributerden biri
	      //sendKeys; seni gitmek istedigin kutucuga yonlendiriyor.
	      Thread.sleep(2000);
	      driver.findElement(By.className("btn_action")).click();//classNama html console'undaki user-name butonuna gittigimizdeki en sondaki attiribute
	      //click(); ekliyoruzki button'i click etsin. Seleniumdaki bir method
	      driver.close();
	 	  
	    }

	
	}


