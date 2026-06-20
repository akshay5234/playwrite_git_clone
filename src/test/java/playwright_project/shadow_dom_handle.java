package playwright_project;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class shadow_dom_handle {
@Test
	public  void shadow_dom_handle1() {
	
   
	 Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	 Page page= browser.newPage();
	
	page.navigate("https://selectorshub.com/xpath-practice-page/");
     
	//do not use xpath in shadow dom
	
	page.locator("#app2 #pizza").fill("set");
     
   
   
   
     
   
   
   
   
   
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
