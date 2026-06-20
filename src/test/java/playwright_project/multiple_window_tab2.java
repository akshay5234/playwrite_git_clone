package playwright_project;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class multiple_window_tab2 {
@Test
	public  void multiple_window_tab23() throws InterruptedException {
  
 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	
	  BrowserContext context = browser.newContext();
	  Page page= context.newPage();
	  page.navigate("https://freelance-learn-automation.vercel.app/login");
	   
	              Locator allpages =page.locator("xpath=(//div[@class='social-btns'])[1]//a");
	              
	         for(int i=0;i<allpages.count();i++) {
	        	 
	               allpages.nth(i).click();	         
	         }
	         
	         
	         List<Page>alllinks= context.pages();
	         
	         for(Page p:alllinks)
	         {	        	 
	        	String title= p.title();
	        	
	        	if(title.contains("Facebook"))
	        	{
	        		p.bringToFront();
	        		p.locator("//input[@name='email']").last().fill("abc@gmail.com");
	        		break;
	        	}
	         }
	 
		       
	              page.bringToFront()  ;
	                
	                
	                page.locator("#email1").fill("Akshay@gmail.com") ; 

	 	
	}

}
