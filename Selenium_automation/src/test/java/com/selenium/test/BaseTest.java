package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	
	public static void main(String[] args) {
		
		// This is only fire-fox browser for selenium version 2 and fire-fox version 46.1
		//WebDriver driver=new FirefoxDriver();  // This line call up casting 
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		// Initialize browser
	    WebDriver driver=new ChromeDriver();
	 		 
		// Open ups
		driver.get("https://www.ups.com/us/en/Home.page");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		// How to implement id 
		//driver.findElement(By.id("ups-menuLinks0")).click();
		
		driver.findElement(By.xpath("(//*[contains(text(),'Log In')])[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
		
		driver.findElement(By.id("pwd")).sendKeys("SAYEDawan2008");
		
		driver.findElement(By.id("submitBtn")).click();
		
		System.out.println(driver.getTitle());
		 
		}
		 
		}
