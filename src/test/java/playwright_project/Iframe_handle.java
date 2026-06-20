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
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Iframe_handle {
@Test(enabled = true)
	public  void Iframe_handle1() throws InterruptedException {
  
 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	
	  BrowserContext context = browser.newContext();
	  Page page= context.newPage();
	   page.navigate("https://vinothqaacademy.com/iframe/");
	   /*
	      List<Frame>allframe= page.frames();   
	       System.out.println("total frame-"+allframe.size());
	       
	      //method 1
	    //   page.frameLocator("#singleframe").locator("xpath=//input[@type='text']").first().fill("Akshay");
	 	
	       //Method 2
	       page.frameByUrl(Pattern.compile(".*SingleFrame.*")).locator("xpath=//input[@type='text']").first().fill("Akshay");
	
	   // nested iframe
	       
	      page.locator("xpath=//a[@class='analystic']").last().click();
	       page.frameByUrl(Pattern.compile(".*MultipleFrames.*"));
	       page.frameByUrl(Pattern.compile(".*SingleFrame.*")).locator("xpath=//input[@type='text']").last().fill("Akshay");
	 */
	       Frame frame= page.frame("registeruser");
	   
	          frame.locator("(//input[@id='vfb-5'])[1]").fill("Akshay");
	      page.waitForTimeout(3000);
	
	
	}

}
