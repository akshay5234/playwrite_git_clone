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

public class video_recording2 {
@Test
	public static void video_recording23() throws InterruptedException {
  
 
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
	   BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideoSize(1000,1000).setRecordVideoDir(Path.of("videos")));
			   
	   Page page= context.newPage();
		
		 page.navigate("https://freelance-learn-automation.vercel.app/login");
		 
		 PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
	     page.waitForTimeout(2000);
	     page.locator("#email1").fill("admin@email.com") ;
	     page.waitForTimeout(2000);
	     page.locator("#password1").fill("admin@123") ;
	     page.waitForTimeout(2000);
	     page.getByText("Sign in").last().click();
	     page.waitForTimeout(2000);
	     PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome Admin Manager to Learn Automation Courses");
	     page.waitForTimeout(2000);
	     page.getByAltText("menu").click();
	     page.waitForTimeout(2000);
	     page.getByText("Sign out").click();
	     page.waitForTimeout(2000);
	     PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));
	     
	     //always close context otherwise video not records
	     context.close();
	     page.close();
	     browser.close();
	}

}
