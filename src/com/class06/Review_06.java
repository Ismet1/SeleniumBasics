package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class Review_06 {

	public static void main(String[] args) {
		
		
		//-------------------------------------Handle Alerts/Popups---------------------------------------//
		//when we have a alert, we have to handle it cuz we can not do something else till we handle the alert.
		//Otherwise we get "UnhandledAlertException"
		//We have two type of Alerts; Windows Based Alerts or Web Based/Browser BasedAlerts.
		//Windows Alert; we have to use switchTo() command first.
		
		//We have another 3 type of Alerts
		//1.Simple Alert; displays some information or warning on the screen.
		//2.Confirmation Alert; displays some information or warning on the screen.
		//3.Prompt Alert; asks some input from the user and selenium webdriver can enter the text using sendkeys(" input.... ").
		
		//Java gives us Alert interface "Alert alert=new Alert()"
		//And this interface give some commands; accept() To accept the alert(OK'e basiyor)
		//dismiss() To dismiss the alert("X"'e basiyor)   //getText() To get the text of the alert   //sendKeys() To write some text to the alert
		
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		//click on Switch link & alert button
		driver.findElement(By.linkText("Switch to")).click();//ilk "switch to" link'ine tikliyoruz.
		driver.findElement(By.id("alert")).click(); //Sonrasinda "alert" butonuna tikliyoruz. Fakat button "alert" veriyor.
	
		Alert alert=driver.switchTo().alert();//Alerti gordukmu bu initiate'i yapiyoruz. Alert ile ilgili islem yapabilmek icin.
		alert.accept(); //Initiate ettikten sonra artik commanlerimizi verebiliriz. Burda ok'e basiyoruz.
		
		driver.findElement(By.id("confirm")).click();//baska bir "confirm" butonuna basiyoruz burda	ve yeni alert veriyor
		Alert confirmAlert=driver.switchTo().alert();//yeni alert icin yeniden initiate yapiyoruz.
		
		//getting text of an alert
		String alertText=confirmAlert.getText();//alertteki yaziyi aliyoruz.
		System.out.println("Text of confirm alert="+alertText);//print ediyoruz
		confirmAlert.dismiss();//sonra alertin "x" butonuna basip kapatmis oluyoruz
		
		
		
		//------------------------------------------------CommonMethod--------------------------------------------------------//
		//CommonMethod class'in da olusturdugumuz , selectValueFromDD methodunu, baska bir classtan bu sekilde call edebiliyoruz.
		//classismi.methodismi(element, text);
		//CommonMethods.selectValueFromDD(countriesDD, "Turkey");
		
		
	}

}
