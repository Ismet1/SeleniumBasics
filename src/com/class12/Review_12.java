package com.class12;

import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Review_12 extends CommonMethods {

	
	//----------------------------------------Broken Links------------------------------------------//
	
	//Broken links are links or URLs that are not reachable. 
	//An URL will always have a status with 2xx which is valid. There are different HTTP status codes which are having different purposes.
	//For an invalid request, HTTP status is 4xx and 5xx.4xx class of status code is mainly for client side error, 
	//and 5xx class of status codes is mainly for the server response error.
	//Some Examples; 200 – Valid Link404 – Link not found400 – Bad request401 – Unauthorized500 – Internal Error
	
	
	//1. grab all links
	// List<WebElement> links=driver.findElements(By.tagName("a")); //Websitesindeki tum linkleri depoluyoruz
			
	//2. get href attribute
			
	// for (WebElement link: links) { //link'lerin url'lerini almak icin for loop olusturuyoruz
	// String linkURL=link.getAttribute("href"); //"href" attribute'unu kullanarak url'lerini aliyoruz.
	
	// URL url=new URL (linkURL); //URL initiation yapiyoruz
	// HttpURLConnection conn=(HttpURLConnection)url.openConnection();
	// int code=conn.getResponseCode(); //linklerin hata code'u aliniyor.
	// if (code==200) {
	//	System.out.println("Link is valid "+link.getText());
	// }else {
	//	System.out.println("Link is NOT valid "+link.getText());
	
	
	
	
	//-----------------------------------Properties file---------------------------------------------//
	
	//Task1 run edilebilir.
	//mainly used in Java programs to maintain project configuration data, database config or project settings
	//Key=Value     or      Key:Value
	//src'a sag tik yapip new>others yapip folder'i seciyoruz. Olusturulan folder'i sag tik yapip new>others yapip file'i seciyoruz
	//tabi ikisinede isim veriyoruz. bu sekilde properties file olusturulur ve icine Key=Value'lar yerlestirilir.
	
	String filePath="src/configs/credentials.properties"; //properties file'in path'ini bir variable'a depoladik
	
	// FileInputStream fis=new FileInputStream(filePath); //Properties file icin object olusturduk
	Properties prop=new Properties(); //Properties file icin object olusturduk
	// prop.load(fis); //properties files bilgilerini "prop"a load ediyoruz.
	
	//Buraya kadar zorunlu prosedur;
	//getProperty() methodu ilede "properties file"daki veriler alinir.
	// String username =  prop.getProperty("username") //mesela burda username bir "key" parantez icindeki. properties file'da bir data'yi verir
	//Ama string yaninda yazdigimiz username ise, normal classta bizim olusturdugumuz variable. Properties filedan aldigimiz
	//data'yi ona depoluyoruz.
}
	
	

