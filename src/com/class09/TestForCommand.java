package com.class09;

import utils.CommonMethods;

public class TestForCommand extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUpDriver("chrome", "http://google.com");
		driver.quit();
	}

}
