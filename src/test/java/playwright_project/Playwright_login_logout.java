package playwright_project;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Playwright_login_logout {
@Test
	public  void Playwright_login_logout1() {
	Browser browser=null;
	Page page =null;
   try
   {
	 browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	 page= browser.newPage();
	
	 page.navigate("https://freelance-learn-automation.vercel.app/login");
	 
	 PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
   
     page.locator("#email1").fill("admin@email.com") ;
   
     page.locator("#password1").fill("admin@123") ;
     
     page.getByText("Sign in").last().click();
     
     PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome Admin Manager to Learn Automation Courses");

     page.getByAltText("menu").click();
     
     page.getByText("Sign out").click();
     
     PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));

     
     
   
   
   
     
   
   
   
   
   }
    finally
    {
	    page.close();
		browser.close();
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
