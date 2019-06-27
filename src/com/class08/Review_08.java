package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Review_08 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.toolsqa.com");
		
		//-------------------------------------Mouse and Keyboard Actions in Selenium-----------------------------------------//
		
		//Move to mouse towards to the item
		Actions action= new Actions(driver); //Action class olusturuyoruz. Mouse yada keyboard ile ne yapcaksak yapalim Action class'i olusturuyoruz.
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='DEMO SITES']")); //action yapmak istedigimiz elementi, bir variable'a depoladik
		action.moveToElement(hoverOver).click().perform(); //Burada action yapmak istedigimiz elemntin ustune gittik sonra clickledik.. En sonda perform() hep kullaniyorz.
		
		//Right Click
		WebElement rightClick= driver.findElement(By.cssSelector("input#password"));
		action.contextClick(rightClick).perform();
		
		//Double Click
		//WebElementini baska variable'a depolamadan bu sekilde de command verebiliriz.
		action.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
		
		//Drag and Drop
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		action.dragAndDrop(drag, drop).perform();
		
		//Click and Hold
		WebElement box4 = driver.findElement(By.cssSelector("li[name='four']"));
		action.clickAndHold(box4).perform();
		
		//release()
		action.release(box4).perform();
		
		//build(); Whenever we use more than one action, we use build() command.
		//action.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().build().perform();
	}

}
