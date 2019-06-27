package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser
*/
public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		WebElement department = driver.findElement(By.id("searchDropdownBox"));
		Select select =new Select(department);
		List <WebElement> alloptions = select.getOptions();
		System.out.println(alloptions.size());
		
		for(WebElement list:alloptions) {
			System.out.println(list.getText());
		}
		
		select.selectByVisibleText("Computers");
		driver.quit();
	}

}
