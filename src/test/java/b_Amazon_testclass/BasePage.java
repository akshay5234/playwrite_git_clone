package b_Amazon_testclass;

import java.nio.file.Path;
import java.util.regex.Pattern;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import a_Amazon_pomclass.AccountHomePage_pomclass;
import a_Amazon_pomclass.HomePage_pomclass;
import a_Amazon_pomclass.LoginPage_pomclass;
import a_Amazon_pomclass.ProductDetailsPage_pomclass;
import a_Amazon_pomclass.ProductPage_pomclass;

public class BasePage {
	BrowserType BrowserType;
	Browser browser;
	Page page;
	BrowserContext context;
	Playwright pw=Playwright.create();
	@Parameters("Browsername")
	@BeforeMethod
	public void setUPMethod( String Browsername)
	{
		
		if (Browsername.equalsIgnoreCase("chrome")) {
			BrowserType=pw.chromium();
			
		}
		else if (Browsername.equalsIgnoreCase("firefox")) {
			BrowserType=pw.firefox();	
		}
        else if (Browsername.equalsIgnoreCase("webkit")) {
        	BrowserType=pw.webkit();
		}
		  browser =BrowserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));	
	//	   BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideoSize(1000,1000).setRecordVideoDir(Path.of("videos")));

		// context = browser.newContext();
		   context = browser.newContext();
		   page= context.newPage();
		
		 page.navigate("https://www.amazon.in/");
			
		}
	

        @AfterMethod

         public void teardown() {
    	     
        	 page.close();
     	     browser.close();
     	     pw.close();

         }

}
	
	
	

