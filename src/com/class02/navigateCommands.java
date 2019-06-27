package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//her sayfaya uyguluyoruz bunlari. Chrome'a baglanmak icin
		driver.navigate().to("http://www.walmart.com");
		Thread.sleep(3000);//3 saniye aralik veriyor degistirmeden once. Yazinca error veriyor sonra yukarida "throws" cozum secenegini isaretle.
		driver.navigate().to("http://google.com");
		driver.navigate().back();//geri diger websitesine gonderiyor
		driver.navigate().forward();//back'in tersi
		driver.navigate().refresh();//refreshing the page
		driver.close();//close
		
	}

}
