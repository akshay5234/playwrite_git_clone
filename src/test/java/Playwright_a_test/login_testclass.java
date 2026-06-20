package Playwright_a_test;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import playwright_a_pom.login_pomClass;

public class login_testclass {
    @Test	
	public  void login_testclass1()
	{
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));	
 	   Page page= browser.newPage();
 	   page.navigate("https://freelance-learn-automation.vercel.app/login");
		login_pomClass  login_pomClass =new login_pomClass(page);
	     
		login_pomClass.login("admin@email.com", "admin@123");
	
		//2nd approach
	//	login_pomClass.enterEmail("admin@email.com").enterPwd("admin@123").clockOnLoginbtn();
		
		//3rd approach			
	//	login_pomClass.enterPwd("admin@123");
	//	login_pomClass.clockOnLoginbtn();
	
	
	
	}
	
}
