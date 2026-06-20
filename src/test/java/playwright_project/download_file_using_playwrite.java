package playwright_project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.ScreenshotOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class download_file_using_playwrite {
@Test
	public  void download_file_using_playwrite1() throws IOException {
		 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	   Page page=browser.newPage();
	   page.navigate("https://the-internet.herokuapp.com/download");
	  
	   Download download= page.waitForDownload(()->
	    { 
		   page.locator("xpath=//a[text()='test_upload.txt']").click();
	   });
	 String downloadpath = System.getProperty("user.dir")+"/download/"+download.suggestedFilename();
	 System.out.println(downloadpath);
	System.out.println(download.suggestedFilename());
	System.out.println(download.url());  
	System.out.println(download.path());
	
	download.saveAs(Paths.get(downloadpath)) ;
	
	if(downloadpath.endsWith(".txt")) {
		
		System.out.println("file extension is verifid");
	}
	else {
		
			System.out.println("file extension is failed");
			
		}
        String datafromfile="empty";
		
			datafromfile = Files.readString(Path.of(downloadpath));
		
	

         System.out.println(datafromfile);
	
	    if(datafromfile.contains("file")) {
	    	System.out.println("pass content test");
	    }
	    else {
			System.out.println("Fail content test");
		}
	    
	
	
	browser.close();
	  
	  
	} 
	  
}


