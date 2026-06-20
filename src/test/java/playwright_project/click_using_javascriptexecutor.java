package playwright_project;

import java.lang.annotation.Documented;
import java.nio.file.Path;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;


public class click_using_javascriptexecutor {
	@Test
	public void click_using_javascriptexecutor1(){
	
  
	Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	
	Page page= browser.newPage();
	
	
		page.navigate("https://login.yahoo.com/");
	System.out.println(page.locator("#persistent").boundingBox().height);
	System.out.println(page.locator("#persistent").boundingBox().width);
	
	//javascriptexecutor method for click
	  page.evaluate("document.getElementById('persistent').click()");
	
	//Another method for click
	Locator checkbox =page.locator("#persistent")	;
	checkbox.evaluate("checkbox => checkbox.click()");
	
	browser.close();
	
		
		
		
		
		
		
		
	}

}
