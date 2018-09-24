package com.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.helper.BrowsserLunch;
import com.pages.LoginPage;


public class TestLogin {

	
		WebDriver driver;
		LoginPage Loginpg=PageFactory.initElements(driver, LoginPage.class);
		
		@Test
		  public void checkValidUser() throws Throwable {
			BrowsserLunch br=new BrowsserLunch();
			driver= br.startBrowser();
			Loginpg=PageFactory.initElements(driver, LoginPage.class);
			
			Loginpg.clearTextField();
			Loginpg.login();
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
		
			
	}




