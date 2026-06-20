package playwright_project;

import java.nio.file.Path;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class file_upload_without_input_tag {
@Test
	public  void file_upload_without_input_tag1() throws InterruptedException {
  
 
	 Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	
	Page page= browser.newPage();
	
	 page.navigate("https://the-internet.herokuapp.com/upload");
	
	 
	FileChooser filechooser=page.waitForFileChooser(()->page.locator("#drag-drop-upload").click());
   
  
		
		Path[] filestoupload= {Path.of(System.getProperty("user.dir")+"/screenshot/17_06_26_22_50_00.png"),
				Path.of(System.getProperty("user.dir")+"/screenshot/17_06_26_22_50_00.png"),
				Path.of(System.getProperty("user.dir")+"/screenshot/17_06_26_22_50_00.png"),
		
		};
		
		filechooser.setFiles(filestoupload);
		
		Thread.sleep(3000);
		
		page.close();
		browser.close();
		
		
		
		
		
	}

}
