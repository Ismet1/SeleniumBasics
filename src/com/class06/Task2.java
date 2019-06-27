package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

/*
TC 2: Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Verify how many options available in the third drop down and then select all.
 */
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestpractice.com/");
		
		/*
		driver.findElement(By.partialLinkText("Select")).click();
        Select obj;
        List<WebElement>list;
        
        WebElement country=driver.findElement(By.cssSelector("#countriesSingle"));
        obj=new Select(country);
        list=obj.getOptions();
        System.out.println(list.size());
        
        WebElement countries=driver.findElement(By.cssSelector("#countriesMultiple"));
        obj=new Select(countries);
        list=obj.getOptions();
        System.out.println(list.size());
        
        for(int i=0; i<list.size();i++) {
            obj.selectByIndex(i);
            
        }
        obj.deselectByVisibleText("China");
        driver.quit();
        */
		
		//Hocanin yaptigi
		
		driver.findElement(By.linkText("Select")).click();
        //working with Single DD
        WebElement countriesDD=driver.findElement(By.id("countriesSingle"));
    
        CommonMethods.selectValueFromDD(countriesDD, "United states of America");
        
        //working with muplitple DD
        WebElement multDD=driver.findElement(By.cssSelector("select#countriesMultiple"));
        Select select=new Select(multDD);
        List<WebElement> optionList=select.getOptions();
        int ddSize=optionList.size();
        System.out.println("# of options in multiple countries dd="+ddSize);
        // check if we can select multiple options
        if(select.isMultiple()) {
            for(int i=0; i<ddSize; i++) {
                select.selectByIndex(i);
                Thread.sleep(1000);
            }
            //another way
            for (WebElement option: optionList) {
                option.click();
                Thread.sleep(1000);
            }
        }    
        
        Thread.sleep(2000);
        driver.quit();
    }
		

	}


