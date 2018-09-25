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

public class AddNewCustomer {
	
		
		public static WebDriver driver;
		public static Properties prop;
		public static FileInputStream fin;

		public AddNewCustomer(WebDriver driver) 
		{
			this.driver=driver;
		}

		
		@FindBy(how=How.NAME,using="password")@CacheLookup WebElement password;
		@FindBy(how=How.NAME,using="btnLogin")@CacheLookup WebElement submit_btn;
		@FindBy(how=How.LINK_TEXT, using="New Customer")@CacheLookup WebElement AddCustomerLink;
		

		public void AddCustomer() throws Throwable
		{
			 			 
			 AddCustomerLink.click();
			 System.out.println("Add New Customer Link Clicked ");
			System.out.println(driver.getTitle());
			
			/*assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage1");
			System.out.println("Login Successful...");*/
		}
		
		

}
