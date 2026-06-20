package playwright_project;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.ScreenshotOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class slider_Action {
@Test
	public  void slider_Action1() throws InterruptedException {
  
		Playwright playwright= Playwright.create();
	   Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	   Page page=browser.newPage();
	   page.navigate("https://freelance-learn-automation.vercel.app/login");
	   page.locator("#email1").fill("admin@email.com") ;
	   page.keyboard().press("Control+a");
	   page.keyboard().press("Control+c");
	   page.locator("#password1").click();
	   page.keyboard().press("Control+v");
	  page.close();
	  browser.close();
	  playwright.close();
	 
	}

}
