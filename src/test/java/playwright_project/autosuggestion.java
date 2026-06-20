package playwright_project;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class autosuggestion {
    @Test
	public  void autossuggestion() {
	Browser browser=null;
	Page page =null;
   
	 browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
	
	 page= browser.newPage();
	
	 page.navigate("https://www.google.com/");
	 
	//page.locator("xpath=//textarea[@title='Search']").click();
	page.locator("xpath=//textarea[@title='Search']").fill("mobile phone");
	
	Locator locator= page.locator("xpath=(//ul[@jsname='bw4e9b'])[1]//li");
	
	
	for(int i=0;i<locator.count();i++)
	{
		
		String text=locator.nth(i).innerText();
		
		System.out.println(text);
		if (text.contains("mobile phone under 10000"))
		{
			locator.nth(i).click();
		}
		
	}
	
	 
     
   
   
   
     
   
   
   
   
   
    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
