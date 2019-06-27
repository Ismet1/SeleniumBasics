package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

/*
 TC 1: Upload file and Take Screenshot

Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot
 */
public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		
		driver.findElement(By.cssSelector("input.gwt-FileUpload")).click();
		
		String filePath="C:\\Users\\ismet\\Desktop\\notes.txt";
		driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();
		
		Alert alert=driver.switchTo().alert();
		
		if(alert.getText().equals("File uploaded!")) {
			System.out.println("File uploaded succesfully");
		
		}else {
			System.out.println("File did NOT upload succesfully");
		}
		alert.accept();
		
		TakesScreenshot camera=(TakesScreenshot)driver;
		File pic=camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(pic, new File("screenshots/Google/upload.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Selfie not taken");
		}
		driver.quit();
	}
}
