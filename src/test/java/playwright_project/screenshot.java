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

public class screenshot {
@Test
	public  void screenshot1() throws InterruptedException {
  
 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	   Page page=browser.newPage();
	   page.navigate("https://www.youtube.com/watch?v=HAlse36TnKU&list=PL6flErFppaj0pscPIPA_Cxhil6ZDeFuJJ&index=17");
	  
	  //for current sceenshot
	   byte[] arr=page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot/"+"set.png")))  ;
	 //for full screenshot
	
	//   byte[] arr1=page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("Screenshot6.png")));
	 utility.captureScreenshot(page);
	   //for element
	   page.locator("#subscribe-button-shape").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("screenshot/"+"one.png")));
	  page.close();
	  browser.close();
	    
	 
	}

}
