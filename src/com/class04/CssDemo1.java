package com.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo1 {

	public static void main(String[] args) {
		// "^" means "starts with" in cssSelector kullanisi normal cssSelector yolundaki gibi. input[attribute^='variabl']
		// "$" means "ending text" kullanisi yine normal cssSelector gibi. input[data-test$='word'] 
		//"*" means contains the text so u can put any part of the word. kullanisi yine ayni. input[data-test*='or'](word kelimesi normalde)

		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("www.toolsqa.com/automation-practice-form/");
		
		
	}

}
