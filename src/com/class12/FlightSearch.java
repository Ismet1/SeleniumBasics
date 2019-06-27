package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

/*
 * TC 12356 - search flight verification
 * step1 navigate to url
 * step 2 enter details
 * step 3 verify search is successful
 */

public class FlightSearch extends CommonMethods{

	//StaleElementReferenceException; bu exception'i gorunce bilgi, sayfa yenilendi. o yuzden o line'da hata verdi.
	//ve islem yapmak istedigin element'i tekrardan find etmelisin.
	
//	String browser="chrome";
//	String url="https://www.aa.com/homePage.do";
	
	//ctrl+shift+o impoart the @test
	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", "https://www.aa.com/homePage.do");
	}
	
	@Test
	public void searchFlight() throws InterruptedException {
		// enter to and from
		Thread.sleep(2000);
		sendText(driver.findElement(By.name("originAirport")), "DCA");
		Thread.sleep(2000);
		sendText(driver.findElement(By.name("destinationAirport")), "JFK");
		// click on calendar icon
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
		// grab element that holds month & year
		WebElement depMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
		
		//istenilen ayi bulmak icin while loop yaptik.
		while (!depMonth.getText().contains("October")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			// if we wont perform this action we will get
			// StaleElementReferenceException: stale element reference: element is not
			// attached to the page document
			depMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div")); //Elementi tekrar bulduruyoruz
			//cunku islem yapildikca sayfa kendini refreshliyo ve elemnti tekrar bulma ihtiyaci hissediyor bunu;
			//StaleElementReferenceException'dan anliyoruz.
		}
		// capturing all cell and then loop and search for specific date
		List<WebElement> depCells = driver
				.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
		for (WebElement cell : depCells) {
			if (cell.getText().equals("18")) {
				Thread.sleep(2000);
				cell.click();
				break;
			}
		}
		// selecting arrival details

		// click on calendar icon
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']/following-sibling::button")).click();
		// grab element that holds month & year
		WebElement arrMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-right')]/div"));

		while (!arrMonth.getText().contains("December")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			// if we wont perform this action we will get
			// StaleElementReferenceException: stale element reference: element is not
			// attached to the page document
			arrMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-right')]/div"));
		}
		// capturing all cell and then loop and search for specific date
		List<WebElement> arrCells = driver
				.findElements(By.xpath("//div[contains(@class, 'group-last')]/table/tbody/tr/td"));
		for (WebElement cell : arrCells) {
			if (cell.getText().equals("24")) {
				Thread.sleep(2000);
				cell.click();
				break;
			}
		}
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
