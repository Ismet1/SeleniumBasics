package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Iframe extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//3 way to go to the frame we wanna go		
		//Way 1; name/id 
				driver.switchTo().frame("iframe_a");
		//Way 2 webelelement 
				//WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
				//driver.switchTo().frame(ele);
		//Way 3 //index
				//driver.switchTo().frame(0);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input#name")).sendKeys("arif");
				
				
				//Buraya kadar frame'in icindeydik. Simdi frame'in disina cikicaz
				driver.switchTo().defaultContent();//cikis commandi
				
				//Simdi baska bir islem yapabilirsin browser uzerinde, istedigin elementi bul, commandle.
				
				
	}

}
