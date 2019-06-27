package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class CellByCell extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		//number of rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		//number of columns
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
	
		for (WebElement r: rows) {
			System.out.println(r.getText());
		}
	
		/*how to print value cell by cell
		 * 1. loop through all rows
		 * 2. loop through all cols
		 * 
		 * 	driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[rows]/td[cols]")).getText();
		 * */
		System.out.println("--------CellByCell 1st way------------------");	
		//1 way
		for(int i=1; i<=rows.size(); i++) {
			for (int j=1; j<=cols.size(); j++) {
				
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cellText);
			}
		}
		//2 way
		System.out.println("--------CellByCell 2nd way------------------");
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td")); //burada "row"lari print etmekten farki su:
		//elemnent'in html'sini alirken en sona /tr/td diyoruz. specific bir [2] numara vermedigimiz icin java tum cell'leri seciyor. ve teker teker yani
		//alt alta print etmis oluyoruz. Onceki ornekte "task01"de bu html'yi sadece "tr" yazarak bitirdik. Asagidaki loop'u kullanincada tum row'lari print etti.
		//Ama row seklinde yani yana yana row'un tamamini print ediyor o sekilde. cell by cell degil.
		
		for (WebElement cell: cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
		}
	}

}
