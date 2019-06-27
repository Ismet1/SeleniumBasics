package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//Description; 
//difference between driver.get()/driver.navigate().to() is; 
//driver.navigate().to(); maintains the browser history, driver.get() does not		
//Webpage Elements; inputs boxes, drop-down lists, check-boxes, radio buttons
//inspect ederken; en basta ve en sonda cikan veriler "Tag name"'dir. En sondaki Tag Name'den onceki text kismina yani websitesinde
//text olarak girilmis datalara "linkText" denir.
		
//"Locator" degerlerine = "Attributes" diyoruz.Locaterlarin yanindaki parantez icine yapistir yaptigimiz degerlere "Attribute Values" diyoruz.	
//8 adet Locater var. Bunlar: id/Name/LinkText/partialLinkText/className/tagName/XPath/CSS Selector
//En populeri "id" ama o yoksa 8 locator'dan hangisini bulursak "inspect" ederken onu kullaniriz. Kullanirken hepsinin yanindaki text kismi girilir.
//linkText kullaniyorsak; linktext kismi kendisi findElement'e yazilir.
//partialLinkText kullaniyorsak; linkText kisminin ilk kelimesi findElement'e yazilir.
//Tag name kullaniyorsak; Tag Name direk kendisi findElement'e yazilir.
		
//-----------------------------------------Selenium Commands-------------------------------------//
		
		
		/*
		
//		driver.get("http:\\google.com");
		driver.get("http:\\facebook.com");
//		driver.close();//sadece kendisinden once yazilan pencereyi kapatiyor.
//		driver.quit();//Tum pencereleri kapatiyor
		
		
		driver.navigate().to("http://www.walmart.com");//driver.get(); ayni gorev
//		Thread.sleep(6000);//Bekleme suresi veriyor. 1000=1sn , 2000=2sn gibi, import edilmesi lazim yoksa hata verir.
		driver.navigate().to("http://google.com");
//		driver.navigate().back();//bir onceki sayfaya geri gidiyor.
//		driver.navigate().forward();//bir sonraki sayfaya gidiyor eger geri gelindiyse daha evvel. gelinmediyse ayni kalicak.
//		driver.navigate().refresh();//refreshing the page
		
		*/
		
//-------------------------------------------Commands/getTitle()/getCurrentUrl();-----------------------------------//
		
		/*
		
		driver.navigate().to("http://google.com");
		driver.getTitle();//basligi aliyo siteden kendine kaydediyor.
		driver.getCurrentUrl();//url'yi aliriz
		System.out.println(driver.getTitle());//burdada ciktisini aliyoruz.
		System.out.println(driver.getCurrentUrl());
		
		String Title = driver.getTitle();//seklinde siteden aldigimiz datayi bir variable'a da tanimlayabilirz.
		System.out.println(Title.equalsIgnoreCase("google"));//bu sekilde basligin istedigin baslik olup olmadigini sorgularsin. Ornek sadece
		
		*/
//-----------------------------------------Commands/findElement(By.())/sendKeys()-------------------------------------//
	
	
		/*
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("bob");//id locator'in yanindaki ifadeyi alir "findElement" methoduna yerlestirirz
        Thread.sleep(2000);
       driver.findElement(By.name("customer.lastName")).sendKeys("tom");//name locator'da da olur. Genelde id'den sonraki o linedaki tum variablelar olablr
        Thread.sleep(2000);
       driver.findElement(By.id("customer.address.street")).sendKeys("123 street");//sendKeys ilede data gonderilir
        Thread.sleep(2000);
       driver.findElement(By.id("customer.address.city")).sendKeys("Asel town");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.address.state")).sendKeys("Va"); 
       Thread.sleep(2000);
       driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.username")).sendKeys("arif1");
        Thread.sleep(2000);
       driver.findElement(By.id("customer.password")).sendKeys("arif10");
        Thread.sleep(2000);
       driver.findElement(By.id("repeatedPassword")).sendKeys("arif10");
        Thread.sleep(2000);
       driver.findElement(By.className("button")).click();//burada className locator'i kullandik.
       // ve burda bir veri gondermiycez cunku textbox degil button oldugu icin "click()" methodu uyg.
	
	
		*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
