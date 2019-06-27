package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_04 {

	public static void main(String[] args) throws InterruptedException {
		//type of TagNames.
		//<a> links // <input> textBox, button, checkbox, radio button
		//<select> dropDown // <img> image //<table> webTable
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//----------------------------------Partial xpath--------------------------------------//
		
		//Partial Xpath;
		//relative xpath'in yazilisindn farki, "[" acinca contains yada starts-with yazilip sonra "(" acilir.
		//ve "=" yerine "," konulur.
		
		//text'li contains ve starts-with ise "@" konmaz ve attribute yerine "text()" yazilir.
		//text'li de mesela hic attribute bulamadik sadece text var, bu yontem kullanilabilir.
		//Ayrica "text()" functioni contains ve starts-with'den bagimsiz da kullanilabilir.
		//Su sekilde;  "//TagName[text()='textline']"   yani   //a[text()='Forgot account?']
		
		//contains();  It is used when the value of any attribute changes dynamically.Value'nin herhangi bir parcasini koyabilirsin
		//   "//TagName[contains(@attribute,'partial value')]" or textVersion  "//TagName[contains(text(),'partial text')]"
		
		//starts-with(); It is used when the value of any attribute changes dynamically.Value'nin baslangic parcasini koyarsin
		//   "//TagName[starts-with(@attribute,’partial value’)]" or textVersion   "//TagName[starts-with(text(), ’partial text’)]"
		
		
		driver.navigate().to("http://facebook.com");
		driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("test.rasmi@gmail.com");//Normalde kelimenin tamami "email". mail yazinca 1/1 oldugu
		//icin yeterli. Sadece "il" de yazabilirdik eger 1/1'i sagliyorsak
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_pa')]")).sendKeys("Syntax123");//contains'in ayni amac sadece yontem farkli. Sondaki 
		//kelimeyi yazarsak bir sonuc vermiyor. Baslangictan itibaren yazmaya baslamak lazim variable'i.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'account?')]")).click();

		
		//Another Example
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'ma')]")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'reg')]")).click();
		
		
		
		
		
		//-----------------------------------cssSelector()-------------------------------------//
		
		//3 farkli sekilde inceledik;
		
		// A)attribute cssSelector;
		//driver.findElement(By.cssSelector(“TagName[attribute=‘value’]")); //Tum attributelar ile uygulanir
		//yani driver.findElement(By.cssSelector(“input[placeholder=‘Enter name...’]"));
		
		// B)id cssSelector;
		//driver.findElement(By.cssSelector("TagName[id='idValue']"));  //bu normal attribute ile yapilan sekli  
		// yani driver.findElement(By.cssSelector("a[id='current time']"));
		//driver.findElement(By.cssSelector("TagName#idValue")); //bu ise id sembollusu "#"
		// yani driver.findElement(By.cssSelector("a#current time"));
		
		// C)class cssSelector;
		//driver.findElement(By.cssSelector("TagName[class='classValue']"));  //bu normal attribute ile yapilan sekli  
		// yani driver.findElement(By.cssSelector("a[class='current time']"));
		//driver.findElement(By.cssSelector("TagName.classValue")); //bu ise class sembollusu "."
		// yani driver.findElement(By.cssSelector("a.current time"));
		
		
		
		
		//Special Characters (*,^,$)
		
		//1. '^' symbol, represents the starting text in a string.
		//2. '$' symbol represents the ending text in a string.
		//3. '*' symbol represents contains text in a string.
		
		
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.cssSelector("a[href^='mercuryregister']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Thedavid");
		driver.findElement(By.cssSelector("input[name$='astName']")).sendKeys("Beckham");
		driver.findElement(By.cssSelector("input[name*='hon']")).sendKeys("5101101010");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("ismetinal35@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("24 Main st.");
		
	}

}
