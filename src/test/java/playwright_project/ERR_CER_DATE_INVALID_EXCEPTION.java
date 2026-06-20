package playwright_project;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class ERR_CER_DATE_INVALID_EXCEPTION {
@Test
	public void ERR_CER_DATE_INVALID_EXCEPTION1() {
		
	
	Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
	
	
	
	 NewContextOptions contextoptions=new Browser.NewContextOptions();
   
	 contextoptions.setIgnoreHTTPSErrors(true);
   
	 BrowserContext context= browser.newContext(contextoptions);
   
     Page page= context.newPage();
   
     page.navigate("https://wrong.host.badssl.com/");
  
	
	browser.close();
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


