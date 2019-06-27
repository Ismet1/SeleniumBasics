package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class Review_11 extends CommonMethods {

	public static void main(String[] args) throws IOException {
		

	//--------------------------------Upload File------------------------------------------------//

	//The first and the Easy way is simple case of just finding the element and typing the absolute path of the document into it.
		
	//WebElement element= driver.findElement(By.name("datafile")); //ilk element bulunup bir variable'a depolanir
	//element.sendKeys("C:\Users\Sandesh\Desktop\testfile.txt"); //sonra sendkey yapilir yuklenmek istenen dosyanin absolute path'i ile.
	
	String filePath="C:/Users/ismet/Desktop/notes.txt"; //yuklemek istedigimiz file'in path'ini en sona dosyanin ismi ve uzantisi eklenmek suretyl.
	driver.findElement(By.id("file-upload")).sendKeys(filePath); //"choose file" butonunun path'i find edilir ve sendKeys ile yuklemek istedigimiz
	//dosyanin yuklenmesi gerceklestirilir.
	driver.findElement(By.id("file-submit")).click(); //burada ise upload butonuna tiklayip yukluyoruz. Ornekte ayric upload butonu var cunku.
	
	
	
	
	//---------------------------------ScreenShot-------------------------------------------------//
	
	//it is necessary to take the screenshot for verification so we can prove also that our test case has covered certain functionality or not.
		
	
	TakesScreenshot camera=(TakesScreenshot)driver; //initiate ediyoruz ve screenshot'i cekmis oluyoruz 
	File selfie=camera.getScreenshotAs(OutputType.FILE); //file olusturuyoruz. File dedigimiz sey burda screenshot'in kendisi.
	FileUtils.copyFile(selfie, new File("screenshots/Google/GoolePage.jpg")); //burada file'i klasorun icine gonderiyoruz.
	//dosya yaratirken "selfie" variable'ini olusturmustuk yani screenshot onun icinde, ayni variable'i burda yine parameter'de kullaniyoruz
	//onun yanindaki parameterde ise "new file" diyip, kopyalamak istedigimiz klasorun path'ini yaziyoruz.
	
	
	
	
	
	//---------------------------------JavascriptExecuter------------------------------------------//
	
	//cast the driver object to JavascriptExecutor
	JavascriptExecutor js = (JavascriptExecutor) driver; //initiate ediyoruz, class'i olusturuyoruz.
	//access the methods:
	js.executeScript("javascript command"); //burada ne islem yapicaksak ona uygun code'u giriyoruz.
	
	
	//Selenium ile scroll down or up yapabiliyoruz.
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,150)");//Vertical scroll - down by 150 pixels 
	//Eger degeri negatif verseydik scroll up yapmis olcaktik.
	js.executeScript("window.scrollBy(0, -400)");// scroll up
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
	// je.executeScript("arguments[0].scrollIntoView(true);", element); //elementin oldugu yere scroll ediyoruz
	
	JavascriptExecutor js2 = (JavascriptExecutor)driver; 
	// js2.executeScript("arguments[0].click();", element); //Element'e click yapiyoruz.
	//Element'e click yapmanin iki yolunu daha onceden gormustuk. click(); command ile yada Action class ile yapmistik. buda 3. yolu.
	
	
	
	
	//----------------------------------Advanced Xpath------------------------------------------------//
	
	//Sometimes multiple elements will have the same attribute/values or no attributes defined in its html, in this case we need to work with this
	//4 different way for Advanced Xpath
		//1.If Parent is having unique identification (parentXpath/childTagName)
		//2.If immediate child is having unique identification (childXpath/..)
		//3.If the next element is having unique identification (nextElementXpath/preceding-sibling::tagName)
		//4.If the previous element is having unique identification (previousElementXpath/following-sibling::tagName)
	
	driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Admin");
	driver.findElement(By.xpath("//span[text()='Password']/../input")).sendKeys("admin123");
	driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	
	}

}
