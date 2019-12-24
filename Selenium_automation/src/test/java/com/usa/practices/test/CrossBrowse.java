package com.usa.practices.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
    public class CrossBrowse {
    static WebDriver driver;	
     /**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		String a="FireFox";
		String b="Chrome";
		String c= "ie";
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
		System.setProperty("webdriver.firefox.driver", "./DriverBrowser/geckodriver.exe");
	    driver = new FirefoxDriver();}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
		//set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver","./DriverBrowser/chromedriver.exe");
		//create chrome instance
	    driver = new ChromeDriver();}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("Edge")){
		//set path to Edge.exe
		System.setProperty("webdriver.IE.driver","./DriverBrowser/IEDriverServer.exe");
		//create Edge instance
		driver = new EdgeDriver();}
		else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	    @Test
	    public void testParameterWithXML() throws InterruptedException{
		driver.get("http://demo.guru99.com/V4/");
		//Find user name
		WebElement userName = driver.findElement(By.name("uid"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		WebElement password = driver.findElement(By.name("password"));
		//Fill password
		password.sendKeys("guru99");}}
