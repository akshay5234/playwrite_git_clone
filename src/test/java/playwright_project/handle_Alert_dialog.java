package playwright_project;

import java.nio.file.Path;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class handle_Alert_dialog {
@Test
	public  void handle_Alert_dialog1() throws InterruptedException {
  
 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	
	   Page page= browser.newPage();
	
	   page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
	   
	   page.onDialog(dialog ->{
		  
		  String msg= dialog.message();
		  
		  System.out.println("dilog text is -"+msg);
		 Assert.assertTrue(msg.contains("I am a JS Confirm")) ;
	       dialog.dismiss();
	   
	   });
	
      page.locator("xpath=//button[text()='Click for JS Confirm']").click();
		
		
	}

}
