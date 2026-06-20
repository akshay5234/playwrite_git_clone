package playwright_project;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.Tracing.GroupOptions;
import com.microsoft.playwright.Tracing.StartChunkOptions;
import com.microsoft.playwright.Tracing.StartOptions;
import com.microsoft.playwright.Tracing.StopChunkOptions;
import com.microsoft.playwright.Tracing.StopOptions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class trracing_in_Playwright2 {
@Test
	public  void trracing_in_Playwright23() {
	Browser browser=null;
	Page page =null;
	BrowserContext context=null;
	Playwright playwright=Playwright.create();
   try
   {
	   
	 browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	  context= browser.newContext();
	 context.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));
	  
	  
	 page= context.newPage();
	
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
    	
    	context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("file/"+"trace.zip")));
    
    	page.close();
		browser.close();
		playwright.close(); 	
		
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
