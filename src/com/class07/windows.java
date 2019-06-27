package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class windows extends CommonMethods{

	public static void main(String[] args) {
		
		//Ilk acilan sayfa=parent , link'e tiklayinca acilan sayfa=child
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
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
	        
	        
	        //Iterator kismini atla.................
//	        Iterator<String> it = allWindows.iterator();
//	        parent=it.next();	//while(it.hasNext){     
//	        String child= it.next();
	        
	        
	        //artik link'e tiklaninca acilan sayfadayiz ve getTitle-getWindowHandle command'lerini tekrar uygulayip onlarin bilgilerinide print ediyoruz
	        String child=driver.getTitle();
	        String childId= driver.getWindowHandle();
	        System.out.println("title: "+child+" "+" ID: "+childId);
	        
	        //driver.switchTo().window(parent);

	    }

	}
		
		
