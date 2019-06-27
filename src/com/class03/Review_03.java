package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_03 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//----------------------------------Absolute Xpath-------------------------------------//
		//Websitesine gidiyoruz. Inspect'i aciyoruz. Ctrl - F yapip inspectte pencere aciyoruz gidis yolumuzu yazabilmemiz icin.
		//ilk "html" ile yada "/"la basliyoruz sonra istedigimiz username kutusuna body den gidildigi icin "body"yaziyoruz.
		//Div yazdikca o sana hangi div'de oldugunu gosteriyor o adette div yazicaz
		//"form"un icine girip; "input[@]" yaziyoruz ve icine locater'dan baska herhangi bir eslesmis veriyi giriyoruz.
		//Sonrada sendKeys ile password'u yada username'i gonderiyoruz.
		
		/*
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@data-test='username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
		*/
		
		
		
		//--------------------------------Relative Xpath--------------------------------------------//
		//Bu kisimda ise direk websitesine gidip, inspect etmek istedigimiz kutucugun ustune gidebiliriz. ordan inspect yapinca
		//direk ktucugun html'si cikar ve "//input[@]" yazip icerden herhangi bir eslenmis deger yine yazip, bu sekilde link'i elde edebiliriz.
		//link'i olusturdugun zaman ctrl-f kutucugunda sagda 1/1 yazar yani o linkten sadece bir tane oldugunu gosterir. Ondan emin ol.
		//Advantage here is, if at all there is any change in the html that works fine. So we mostly use this.
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		
		
	}

}
