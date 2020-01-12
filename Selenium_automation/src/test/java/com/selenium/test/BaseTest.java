package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	// This is a my github testing
	//gfrughrhrgtjlh
	
	
	public void Hello() {
		
	}
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

//Types of X-path
//There are two types of XPath:

//1) Absolute XPath

//2) Relative XPath

//Absolute XPath:
//It is the direct way to find the element, but the disadvantage of the absolute XPath is that if there are any changes made in the path of the element then that XPath gets failed.

//The key characteristic of XPath is that it begins with the single forward slash(/) ,which means you can select the element from the root node.

//Below is the example of an absolute xpath expression of the element shown in the below screen.

//Absolute xpath:

// html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/b

//Relative xpath: //*[@class='featured-box']

           // How to create xpath formula 
        //Xpath=//tagname[@attribute='value']
        // Xpath=//input[@name='uid']

// text xpath method 
          //*[text()='Testing']

// contain method
//Xpath=//*[contains(@type,'sub')] 

//Xpath=//*[contains(text(),'here')]

//Xpath=//*[@type='submit' or @name='btnReset']

//Xpath=//label[starts-with(@id,'message')]
//Xpath=//*[@type='text']//following::input
//Xpath=//*[@type='submit']//preceding::input
//xpath=//*[@type='submit']//following-sibling::input

//Xpath=//*[@id='rt-feature']//parent::div

//Xpath =//*[@type='password']//self::input
//Xpath=//*[@id='rt-feature']//descendant::a






















