package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open face book
		driver.get("https://www.ups.com/us/en/Home.page");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[contains(text(), 'Log In')] )[1]")).click();
		 
		}
		 
		}
