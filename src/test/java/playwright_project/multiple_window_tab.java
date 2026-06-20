package playwright_project;

import java.nio.file.Path;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class multiple_window_tab {
@Test
	public  void multiple_window_tab1() throws InterruptedException {
  
 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	
	  BrowserContext context = browser.newContext();
	  Page page= context.newPage();
	  page.navigate("https://freelance-learn-automation.vercel.app/login");
	   
	 Page newpage= context.waitForPage(()->
	  {
		  page.locator("//a [contains(@href,'facebook')]").first().click();	  
	  } );
	  
	  newpage.locator("//input[@type='text']").fill("akshay@gmail.com");
	  
	 	page.bringToFront();
		  page.locator("#email1").fill("Akshay@gmail.com") ; 

	 	
	}

}
