package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws InterruptedException {
		//Contains/Start-with/ends-with module'u gorduk. Ikiside bu attribute varmi yada bu text varmi diye yokluyor
		//Text'in yontemi ayri slaytta var. eger html linkinin icinde text yoksa "text" yolu kullanilmaz.
		

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[starts-with(@type, 'text')]")).sendKeys("standard_user");//contain ile de yapabiliriz. Slayt'a bak
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@type, 'password')]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@type, 'submit')]")).click();
	}

}
