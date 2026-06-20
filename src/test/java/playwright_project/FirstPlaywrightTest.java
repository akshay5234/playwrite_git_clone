package playwright_project;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstPlaywrightTest {
	@Test
	public  void FirstPlaywrightTest1() {
		
	Playwright pw=	Playwright.create();
	BrowserType browsertype= pw.chromium();
	Browser browser= browsertype.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
	Page page= browser.newPage();
	page.navigate("https://playwright.dev/java/docs/intro");
	String title=page.title();
	System.out.println("title is"+"-" +title);
	page.close();
	browser.close();
	pw.close();
	
	
	
	}

}
