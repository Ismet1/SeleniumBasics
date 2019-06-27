package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 TC 2: Syntax Page URL Verification:
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”
 */
public class TC2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.syntaxtechs.com");
		
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		String url=driver.getCurrentUrl();
		if(url.contains("Syntax")) {
			System.out.println("Url contains Syntax");
			}
			else {
				System.out.println("sorry Url does not contains Syntax");
			}

	}

}
