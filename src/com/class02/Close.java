package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cnn.com");
		driver.get("http://google.com");
		//driver.close();
		//driver.quit();//close whole browser
	}

}
