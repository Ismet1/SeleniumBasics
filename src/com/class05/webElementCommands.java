package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementCommands {
	
	
	public static String userName = "Tester";
	public static String password = "test";
	

	public static void main(String[] args) throws InterruptedException {
		
	


			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// maximize window
			driver.manage().window().fullscreen();
			driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
			// storing userName text box inside variable
			WebElement userNameTxt = driver.findElement(By.cssSelector("input[id*='username']"));//WebElement(Data type selenium'un. 
			//bunu kullanarak "Username textbox'ini store ediyoruz ve istedigimiz functionlari kullanicaz uzerinde)
			userNameTxt.sendKeys("John");
			Thread.sleep(1000);
			userNameTxt.clear();
			userNameTxt.sendKeys(userName);// sendKeys--> will append text
			// storing password text box inside variable
			WebElement pwdTxt = driver.findElement(By.cssSelector("input[type='password']"));
			pwdTxt.clear();
			pwdTxt.sendKeys(password);
			// click on the Login btn
			driver.findElement(By.cssSelector("input[value='Login']")).click();
			// verify logo is displayed
			boolean isDisplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();//.isDisplayed func gorunurmu degilmi bunu bul.
			System.out.println(driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed()); //true
			
			if (isDisplayed) {
				System.out.println("WebOrder logo is displayed");
			} else {
				System.out.println("WebOrder logo is NOT displayed");
			}
			// capture welcome element
			WebElement welcome = driver.findElement(By.xpath("//div[@class='login_info']"));
			String value = welcome.getText();//bunu yaparak webElement'in icindeki text'i alip "value" variable'ina depoluyoruz.
			System.out.println(value+"getText()'in ciktisi");
			if (value.contains(userName)) {
				System.out.println(userName + " is logged in. Test case PASS");
			} else {
				System.out.println(userName + " is NOT logged in. Test case FAIL");
			}
			Thread.sleep(3000);
			driver.quit();

			//"get.attribute("class")" var slaytttan incele. returns value of specified attribute(class).
	}

}
