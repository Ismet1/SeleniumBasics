package com.class10;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Review_10 {

	public static void main(String[] args) {
		
		//---------------------------------------------getAttribute()---------------------------------------------//
		
		//getAttribute() ile CheckBox/RadioButton yanindaki secenekler veyahut textbox/label icerisindeki bilgiler getText yapilabilir.
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//		
//		String textToEnter="Sunday"; 
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter); //Sunday'i gonderdik textbox'a
//		
//		String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value"); //burada textbox'in icinde ne varsa cekiyoruz
//		//compare entered and returned text
//		if (returnedText.equals(textToEnter)) { //burada da check ediyoruz gonderdigimiz ifademi var diye.
//			System.out.println("Text is entered");
//		}else {
//			System.out.println("Text "+textToEnter+" is NOT entered");
//		}
		
		
		
	//----------------------------------------------WebTable()-----------------------------------------------//
		
		
	//-------------Static Table(Row'lari toplu print etme)------------------//
		
			//GET NUMBER OF ROWS  //Row diyince direk "tbody"e gidiceksin. ordan tr'yi bulucaksin. (row diyince aklina body'deki rowlar gelsin)
//			List <WebElement> rows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
//						
//			System.out.println("-----------ROW DATA-----------------");
//			Iterator<WebElement> it=rows.iterator();
//			while(it.hasNext()) {
//			String rowText=it.next().getText();
//			System.out.println(rowText);
//			}
//						
//		//GET NUMBER OF COLUMNS //Columns diyince direk "thead"'e gidiceksin tr'nin icrsinden th'yi bulucaksin (column diyince aklina head'teki column gelsin)
//			List <WebElement> cols=driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
//						
//			System.out.println("-----------COLUMNS HEADERS-----------------");
//			for (WebElement col: cols) {
//			String colText=col.getText();
//			System.out.println(colText);
//			}
				
		
		
		
	//-------------Dynamic Table(Row'lari tek tek print etme)----------//
			
		//Bu sayfasyi StaticWebTableDemo'dan calistirabiliriz.
		//get number of rows and cols
		
	//	List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr")); //Tum "tr"leri yani rowlari depoluyoruz.
		//Burada parca parca degil yalniz. Bunu print etmeye kalksak bize tum rowlari verir. Eger thead varsa onu row'dan saymiyoruz. O coloumn'u bulmak icin
		//kullaniliyor. Yani row degince direk tbody gidip oradaki "tr"lerin sayisini bulmak olucak.
	//	List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/td")); //Bu ornekre thead yokki column sayisini bulmak
		//icin tbody'e girilmis orada "tr"ya girilmis ve "tr"'nin bir tanesi secilmiski, column sayisini bulalim. Eger thead olsaydi oradan bulacaktik.
				
		
		//Click on the checkbox next to "Susan McLaren"
		String expectedValue="Canada";
				
	//	for (int i=1; i<=rows.size(); i++) { // i loop kullanarak row'lari parcaladik
	//		String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText(); //burada herbir row'u tek tek depoladik
	//table elementinin html'si icerisine olusturulan i loop'un "i"si "tr"'nin yanina konulurki, tek tek print etsin.
	//eger advanced loop kullansaydik tablodaki checkbox'lari click edemiycektik. cunku sayfa kendini yeniliyor , yenileyince islem yapmak
	//istedigin elementi tekrar buldurman gerekiyor. Bunuda i loop ile yapabiliyorsun.
				
	//	if(rowText.contains(expectedValue)) { //burada da istenilen sart codelaniyor.
	//		driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[1]")).click();
	//				}}
				

	
	//----------------------CellByCell print--------------------------//
	
	//1 way
//				for(int i=1; i<=rows.size(); i++) {
//					for (int j=1; j<=cols.size(); j++) {
//						
//						String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
//						System.out.println(cellText);
//					}}
				
				
	//2 way
				
//	List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td")); 
//				
//				for (WebElement cell: cells) {
//					String cellText=cell.getText();
//					System.out.println(cellText);
//				}
	
	
		
		
		
		//------------------------Calender(Date Picker)----------------------------//
		
		
//		driver.findElement(By.id("datepicker")).click(); //ayin gunlerinin bulundugu sablona tikladik
//		
//		String expectedDate="30"; //tikliycagimiz gunu depoladik
//			
//		List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));//tum gunleri "cells" verdik
//		for (WebElement cell: cells) {
//			//get text of each cell
//			String cellText=cell.getText();
//			if (cellText.equals(expectedDate)) {
//				cell.click();
//			}
//		}
	}

}
