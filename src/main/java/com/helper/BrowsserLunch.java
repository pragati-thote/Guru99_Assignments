package com.helper;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowsserLunch {
	
	
public static WebDriver driver;
public static Properties prop;
public static FileInputStream fin;


@Test
public WebDriver startBrowser() throws IOException, InterruptedException, AWTException {
  prop=new Properties();
  fin=new FileInputStream("/home/bynry-17/Documents/Selenium/Selenium Maven Projects/BestPractice_99/Parameters.properties");

  prop.load(fin);
  
  if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver","/home/bynry-17/Documents/Selenium/CESC_Automation/geckodriver");  
	  driver=new FirefoxDriver();
	  System.out.println("Browser Open Successfully");
  }
  else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
  {
	
	  System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
	  driver=new ChromeDriver();
	  System.out.println("Browser Open Successfully");
  }
  else
  {
	  System.out.println("No such a browser found...");
  }

	 driver.get(prop.getProperty("url"));	
	 return driver;	
	
	 
}


}