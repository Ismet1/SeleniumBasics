package com.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_07 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://uitestpractice.com/Students/Switchto");
		
		
		
		//-------------------------------------------------------iframe--------------------------------------------------//
		
		
		//iframe elementine gitmenin 3 yolu var
		//1.Name ve id ile; driver.switchTo().frame(ValueOfTheName)
		driver.switchTo().frame("iframe_a");
		
		//2."xpath/cssSelector" yontemi ile;
		//Elementlere her zaman gittimiz yontemi bir variable tanimlarsin. Sonra o variable'i swithcTo().frame() methoduna yerlestirirsin.
		WebElement iframeAnektar = driver.findElement(By.cssSelector("iframe[src='/Demo.html']"));
		driver.switchTo().frame(iframeAnektar);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='/Demo.html']")));//Bu sekilde tek satirda da toparlayabilirsin bunu.
			
		//3.Index yontemi ile; (Her frame'in index'i var, Inspect ettigimizde yukardan asagiya numaralandirilir.
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("arif");//bunu yontemlerin calisip-calismadigini gormek icin yazdik.
		
		
		
		
		//iframe'in icinden pencereye geri donme methodu.
		driver.switchTo().defaultContent(); //bunu yapamadan frame disindaki herhangi bir elemente komut veremezsin. ilk frame'den cikicaksin.
		
		
		
		
		//---------------------------------------------------For Loop ile tab degistirme--------------------------------------//
		
		String parent = driver.getTitle(); //ilk acilan sayfanin basligini "parent" kelimesine depoladik
		String parentId = driver.getWindowHandle();//ID number'ini depoladik
		System.out.println(parent+""+" ID: "+parentId); 
		
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();//ikinci sayfayi acmak icin link'e tikliyoruz
		 
	        Set<String> allWindows = driver.getWindowHandles(); //Iki sayfaninda ID numarasini almak icin set olusturduk
	        for(String ID:allWindows) { //ID numaralarini burda tek tek for loop icine gonderiyoruz
	        	if(!parentId.equals(ID)) { //Sirayla gelen numaralardan biri, yukarida "parent" kelimesine depoladigimiz numaradan farkli ise, gecisine izin veriyoruz.
	        		driver.switchTo().window(ID); //parent kelimesine depolanmis id numarasindan farkli olan id numarasi bu line'a geldi.	        		
	        	} //ve dolayisiyla o id numarali sayfaya switch ettik.
	        }
	        
	      //artik link'e tiklaninca acilan sayfadayiz ve getTitle-getWindowHandle command'lerini tekrar uygulayip onlarin bilgilerinide print ediyoruz
	        String child=driver.getTitle();
	        String childId= driver.getWindowHandle();
	        System.out.println("title: "+child+" "+" ID: "+childId);
	        
	}

}
