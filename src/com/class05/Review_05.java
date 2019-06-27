package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Review_05 {

	public static void main(String[] args) {
		
		

		// --------------------------------------WebElement data type------------------------------------------------//
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// webElementCommands class'indan calistirabilirsin
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		// storing userName text box inside variable and storing password text box
		WebElement userNameTxt = driver.findElement(By.cssSelector("input[id*='username']"));
		userNameTxt.sendKeys("John"); // sending name to the username box
		userNameTxt.clear(); // clearing username box
		userNameTxt.sendKeys("Tester");
		WebElement pwdTxt = driver.findElement(By.cssSelector("input[type='password']"));
		pwdTxt.sendKeys("test");
		
		
		
		
		//-----------------------------------isDisplayed() & getText()------------------------------------------------//
		//webElementCommands class'indan calistirabilirsin
		//Bir webelement'i data type'ina gore String, boolean vs de initilize edebiliriz yada WebElement'e initilize edip
		//daha sonra ayri bir variable yaratarakda kullanbiliriz ve bu asamada String, boolean vs kullaanmak gerekir.
		//Tamamen basliktaki command'leri nerede yazdigimiz ile ilgili bir durum. Asagida ikisininde ornegi var.
		
		//Asagidaki ornekte "Logo" element'i ile ugrasuyoruz. O yuzden isDisplayed logoya uyan bir command.
		//isDisplayed() command; //boolean typetir. webElement gorunur mu degilmi. Bunun cevabini aldigimiz command.
		boolean isDisplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed(); //Logoyu aldik isDisplayed'e tanimladik.
		if (isDisplayed) { //isDisplayed=true'ya esitlendi yukarda
			System.out.println("WebOrder logo is displayed"); //dolayisiyla bu if condition, bu line i print eder.
		} else {
			System.out.println("WebOrder logo is NOT displayed");
		}
		
		//Asagidaki ornekte "Link" element'i ile ugrasuyoruz. O yuzden getText() link'e uyan bir command.
		//getText() command; //String typetir. Cunku websitesinden text store ediyoruz.
		WebElement welcome = driver.findElement(By.xpath("//div[@class='login_info']")); //Burada LogIn Link'ini  kismini "welcome"a depo edioruz.
		String value = welcome.getText(); //LogIn'in icindeki text'i almak icin "getText()" commandini kullaniyoruz.
		System.out.println(value);
		
		
		
		//---------------------------------isEnabled() & isSelected()-----------------------------------------------------//
		//RadioDemo class'indan calistirabilirsin.
		//isEnabled( ) : boolean - This determines if the element currently is Enabled or not? returns boolean value(true/false).
		//isSelected( ) : boolean - Determine whether or not this element is selected or not. returns boolean value(true/false).
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\ismet\\Selenium\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio=driver1.findElement(By.id("sex-0")); //radioButton'i inspect ettik
		System.out.println(maleRadio.isDisplayed());//true
		System.out.println(maleRadio.isEnabled());//true
		System.out.println(maleRadio.isSelected());//false
		
		
		
		//------------------------------------------getAttribute & How to click ----------------------------------------------------//
		//RadioDemo class'indan calistirabilirsin.
		//getAttribute(String Name) : String- This method gets the value((radio button yada checkbox'in yanindaki yaziyi yani secenegi aliyor)
		//Burda parantezin icine attribute yaziyoruz. Asagidaki ornekte "Value" attribute'ini yazdik cunku buttonlarin yanindaki secenekler
		//genelde value attribute'u icinde veriliyor. Value genelde html dilinde secenekleri ifade ediyor.))
		//of the given attribute of the element. 
		//This accepts the String as a parameter and returns a String value.
		//Bu command'i bisey click etmek icin kullaniriz. Basitce click() command'ide kullanilir ama eger bize verilen bir ifadeyi click etmemiz 
		//istenirse mesela asagida valueToSelect gibi
		
		String valueToSelect = "Automation Tester";
		List<WebElement> professionList = driver.findElements(By.name("profession")); //siteddeki "name" attribute'unda "profession" yazan
		//tum elementlerin listesini olusturduk ve bunu "professionList"e depoladik
		//Note!!! List yaparken "findElements" kullancasin cunku "findElement" hata veriyor.

		for (WebElement profession : professionList) { //depoladigimiz listeyi her bir elementin tek tek ele alinmasi icin for loop olusturduk
		//profession; burda elementlerin her birini sirayla teker teker temsil ediyor.
			if(profession.getAttribute("value").equals(valueToSelect)){ //Yukaridaki bu if'in aciklamali ifadesi gibi
				profession.click();
			}}
		
		
		
		
		
		//---------------------------------------Finding the amount of Element or Print their texts-----------------------------------//
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\ismet\\Selenium\\chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		
		
		driver2.get("https://www.ebay.com/");
		List <WebElement> links=driver2.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		int count=0;
		for (WebElement link:links) {
			String linkText=link.getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
			
		//Iteratorlisi asagida veriler farkli yalniz yapi ayni
//		int count=0;		
//		Iterator<WebElement> linksIt=links.iterator();
//		while(linksIt.hasNext()) {
//			String linkText=linksIt.next().getText();
//			if (!linkText.isEmpty()) {
//				System.out.println(linkText);
//				count++;
//			}
//		}
		
		System.out.println("Total number of links with text "+count);
		
		
		
		//------------------------------------------DropDown & Multiple Select---------------------------------------------------------//
		//Only differences between them, we cant do deselection on dropdown cuz we can not select more than one option like at Multiple Select.
		//To perform any action about dropDowns we have to initiate it with "Select" keyword. Select s = new Select
		//Why "Select"? cuz select sembolize the dropdowns in html language.
		//DropDown'in icindeki secenekler <option> tagname ile cikar icindeki attribute'lar "value" olur. O attribute'larin value'lari ise
		//secenegin ocelligine gore degisir. yillar, cinsiyetler vs.
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\ismet\\Selenium\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();		
		driver3.get("https://www.toolsqa.com/automation-practice-form/");
		
		//element'i depolarken list yaratmamiza gerek yok cunku element tek bir element
		WebElement continentDD = driver3.findElement(By.id("continents"));
		
		Select obj=new Select(continentDD);
		
		
		//---------------selectByIndex() & selectByVisibleText("") ----------------------------------//
		//DropDown'dan 3 farkli sekilde option secilebilir.
		//select by index
		obj.selectByIndex(3);//Australia
		
		//select by visibleText
		obj.selectByVisibleText("North America");
		
		//select by value
		//obj.selectByValue("");
		
		
		//------------deselect()/deselectAll() & isMultiple() & getOptions()-----------------------------------//
		//deselect() //DropDown'da deselect yapilamaz ama Multiple Selection'da yapilir
		//ornek istersen package6'da dropdown review'i incele
		WebElement commandsDD=driver.findElement(By.id("selenium_commands"));
		Select select1=new Select(commandsDD);
		List<WebElement> allOptions1=select1.getOptions();
		
		select1.selectByIndex(2);
		select1.deselectByIndex(2);
		select1.deselectAll();//bu command de ise daha evvel select edilmis tum veriler deselect oluyor.
		
		//isMultiple()
		//to verify if drop down allows multiple selection use method isMultiple();
		//DropDown mu Yoksa Multiple Select mi onun tespitini yaparis bu command ile.
		
		
		//getOptions() //tum optionlari depolamis olursun. Size'ini bulabilirsin yada print edebilirsin for loop ile.
		List<WebElement> allOptions=obj.getOptions(); //Element'in tum optionlarini depolarken LIST'e ihtiyacimiz var cunku birden fazla item.
		System.out.println(allOptions.size());
		
		}
	}


