package com.HandlingScroll;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.*;

public class TestScroll {
	WebDriver driver;
	String url="https://www.spicejet.com/";
	
	@Test
	public void Test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollby(0,-1400)");
		
	}

}
