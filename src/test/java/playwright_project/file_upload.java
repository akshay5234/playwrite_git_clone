package playwright_project;

import java.beans.Transient;
import java.nio.file.Path;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class file_upload {
@Test
	public  void file_upload1() throws InterruptedException {
	Browser browser=null;
	Page page =null;
   try
   {
	 browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	
	 page= browser.newPage();
	
	 page.navigate("https://the-internet.herokuapp.com/upload");
	
	// page.locator("#file-upload").setInputFiles(Path.of(System.getProperty("user.dir")+"/file/Screenshot (3).png"));
	 
	 Thread.sleep(3000);
     
   //multiupload  
   Path []files = {Path.of(System.getProperty("user.dir")+"/screenshot/17_06_26_22_50_00.png")};
   
   page.locator("#file-upload").setInputFiles(files);
     
	 Thread.sleep(3000);
  //this is array 
	 page.locator("#file-upload").setInputFiles(new Path[0]);
   
   
   }
    finally
    {
	    page.close();
		browser.close();
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
