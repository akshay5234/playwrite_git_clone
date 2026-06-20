package playwright_project;

import java.util.regex.Pattern;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class setup_class {
	BrowserType BrowserType;
	Browser browser;
	Page page;
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
		browser=BrowserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		 page= browser.newPage();
		
		 page.navigate("https://freelance-learn-automation.vercel.app/login");
			
		}
		
	@Test
	public void test1() {
		
		 PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
		   
	     page.locator("#email1").fill("admin@email.com") ;
	   
	     page.locator("#password1").fill("admin@123") ;
	     
	     page.getByText("Sign in").last().click();
	     
	     PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome Admin Manager to Learn Automation Courses");
	     page.getByAltText("menu").click();
 	     
 	     page.getByText("Sign out").click();
 	     
 	     PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));
 	    
	   
	}

        @AfterMethod

         public void teardown() {
    	
        	 page.close();
     	     browser.close();
     	     pw.close();

         }



}
	
	
	
	
	
	


