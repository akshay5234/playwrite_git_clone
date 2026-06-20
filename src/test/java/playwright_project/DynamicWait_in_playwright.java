package playwright_project;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import javax.xml.xpath.XPath;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.invokers.ExpectedExceptionsHolder;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.IsVisibleOptions;
import com.microsoft.playwright.Locator.ScreenshotOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.LocatorAssertions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitForSelectorState;

public class DynamicWait_in_playwright {
     @Test
	public  void DynamicWait_in_playwright1() throws InterruptedException {
  
		Playwright playwright= Playwright.create();
	   Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	   Page page=browser.newPage();
	   page.navigate("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html",new Page.NavigateOptions().setTimeout(50000));
	 //for url time
	   page.setDefaultNavigationTimeout(5000);
	//for weblement time 
	  page.setDefaultTimeout(5000);
	  page.locator("//button[text()='Click me to start timer']").click();
	   //For particular web element time
	   page.locator("//p[text()='WebDriver']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE).setTimeout(15000));
	 
	  	   	   
	   page.waitForLoadState(LoadState.LOAD);
	page.close();
	browser.close();
	playwright.close();
	  
	}

}
