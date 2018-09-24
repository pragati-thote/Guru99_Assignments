package com.pages;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fin;

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	@FindBy(name="uid")@CacheLookup WebElement username;
	@FindBy(how=How.NAME,using="password")@CacheLookup WebElement password;
	@FindBy(how=How.NAME,using="btnLogin")@CacheLookup WebElement submit_btn;
	

	public void login() throws Throwable
	{
		 prop=new Properties();
		 fin=new FileInputStream("/home/bynry-17/Documents/Selenium/Selenium Maven Projects/BestPractice_99/Parameters.properties");
		 prop.load(fin);
		  
		username.sendKeys(prop.getProperty("unm"));
		password.sendKeys(prop.getProperty("password"));
		submit_btn.click();
		
		//System.out.println(driver.getTitle());
		
		assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage1");
		System.out.println("Login Successful...");
	}
	
	public void clearTextField()
	{
		username.clear();
		password.clear();
	}

	
}
