package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().fullscreen();
			driver.get("https://www.toolsqa.com/automation-practice-form/");

			//element'i depolarken list yaratmamiza gerek yok cunku element tek bir element
			WebElement continentDD = driver.findElement(By.name("continents"));
			
			Select obj=new Select(continentDD);
			//select by index
			obj.selectByIndex(3);//Australia
			Thread.sleep(2000);
			//select by visibleText
			obj.selectByVisibleText("North America");
			
			obj.selectByValue("Africa");
			
			//get allOptions
			//Element'in tum optionlarini depolarken LIST'e ihtiyacimiz var cunku birden fazla item.
			List<WebElement> allOptions=obj.getOptions();
			System.out.println(allOptions.size());
			
			
			Thread.sleep(2000);
			//driver.quit();
		}
	
	}


