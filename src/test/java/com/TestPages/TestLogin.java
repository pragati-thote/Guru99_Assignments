package com.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import com.helper.BrowsserLunch;
import com.pages.AddNewCustomer;
import com.pages.LoginPage;


public class TestLogin {

	
		WebDriver driver;
		LoginPage Loginpg=PageFactory.initElements(driver, LoginPage.class);
		
		
		@Test(priority=1)
		  public void checkValidUser() throws Throwable {
			BrowsserLunch br=new BrowsserLunch();
			driver= br.startBrowser();
			Loginpg=PageFactory.initElements(driver, LoginPage.class);
			
			Loginpg.clearTextField();
			Loginpg.login();
		}
		
		@Test(priority=2)
		public void checkAddCustomer() throws Throwable {
			AddNewCustomer cust=PageFactory.initElements(driver,AddNewCustomer.class);
			cust.AddCustomer();
		}
		
		@AfterTest
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();
		}
		
			
	}




