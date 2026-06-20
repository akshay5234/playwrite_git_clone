package playwright_project;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import javax.xml.xpath.XPath;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.ScreenshotOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class drag_drop {
     @Test
	public void drag_drop1() throws InterruptedException {
  
		Playwright playwright= Playwright.create();
	   Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	   Page page=browser.newPage();
	   page.navigate("https://jqueryui.com/droppable/");
	  FrameLocator frameLocator= page.frameLocator("xpath=//iframe[@class='demo-frame']");
	 //  frameLocator.locator("#draggable").dragTo(frameLocator.locator("#droppable"));
	  frameLocator.locator("#draggable").hover();
	    page.mouse().down();
	    frameLocator.locator("#droppable").hover();
	    page.mouse().up();
	    
}}
