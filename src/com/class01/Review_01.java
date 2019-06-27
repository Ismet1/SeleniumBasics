package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_01 {

	public static void main(String[] args) {
		
		//Description;
		/*
		 * Selenium is a free (open source) automated testing suite.
		 * 
		 * We can automate testing for web applications only. It does not qualify for window-based applications.
		 * 
		 * We do automation frequently regression testing, whenever a new feature introduced to application we perform 
		 * functional testing too and in User Acceptance Test and Smoke testing.
		 * 
		 * Selenium has 4 component. IDE(prototype)/RC(meaning; remote control)/WebDriver and Grid. Webdriver transformed to Selenium 2 and then Selenium 3.
		 * Today we use Selenium 3.14 which based on Selenium WebDriver.
		 * 
		 * Selenium Grid; we use this with RC to make parallel execution which means multiple executions.
		 * 
		 * Another important test tool is QTP(quick test professional) but it wasnt work with many browsers and it's commercial you have to pay.
		 * But Qtp can run web and desktop apps both. has object repository. faster than Selenium. Has customer support. Selenium doesnt have these things.
		 * 
		 * Selenium webdriver architecture divided into 3 parts; a)Language Level Bindings(Java, python) b)API c)Drivers(chrome, firefox) 
		 */
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\ismet\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//google chrome'un objectini olusturduk. (Instantiation) 
		//WebDriver - is interface which is inherited. 
		//new - is the keyword in java which creates an object 
		//ChromeDriver() -is constructor which implements the data.
		//driver - reference variable
		//Her class'ta yazmamiz gereken kalip bu google chrome'a baglanabilmek icin
			
		driver.get("http://www.google.com");//"get" methodu ile siteye gidiyoruz. "http://" kullanmamiz sart!
		
		driver.manage();//manage command'i tek basina bisey yapmaz "." koyup neyi manage edicegimizi soylemeliyiz.
		driver.manage().window();//Sonraki adim olarak window'u manage et dedik ama buda tek basina bisey yapmaz. 
		//Windiw ile ile ilgili neyi manage edicez diye duraksar.
		driver.manage().window().maximize();//maximize ettik.
		//driver.manage().window().fullscreen();//maximize'dan farkli olarak ustteki control cubugunuda kaldirip full screen yapti.
	
		
	}
}
