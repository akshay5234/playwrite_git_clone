package playwright_project;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Playwright_Handle_dropdpwn_checkbox {
@Test
	public  void Playwright_Handle_dropdpwn_checkbox1() {
		Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
		Page page= browser.newPage();
		
		 page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		 PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
		// page.pause();
		
		 page.locator("xpath=//a[text()='New user? Signup']").click();
	//	 page.pause();
		 
	     PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("signup"));
		 
	     page.locator("xpath=//button[@class='submit-btn']").isDisabled();

	     
	     page.locator("xpath=//input[@id='name']").fill(new Faker().name().fullName());
	     page.locator("xpath=//input[@id='email']").fill(new Faker().name().firstName()+"_"+new Faker().name().lastName()+"@gmail.com");
	     page.locator("xpath=//input[@id='password']").fill("Akshay@123");
	     
         page.locator("xpath=//label[text()='PHP']").click();
		 PlaywrightAssertions.assertThat(page.locator("xpath=//label[text()='PHP']")).isChecked();

		 page.locator("xpath=//input[@value='Female']").click();
		 PlaywrightAssertions.assertThat(page.locator("xpath=//input[@value='Female']")).isChecked();

		 page.locator("xpath=//select[@id='state']").selectOption("Andhra Pradesh");
		 
		 String hobbies[]= {"Playing","Swimming"};
		 page.locator("#hobbies").selectOption(hobbies);

		 page.locator("xpath=//button[@class='submit-btn']").isEnabled();
		 page.locator("xpath=//button[@class='submit-btn']").click();
		page.close();
		browser.close();
		
		 
	
		 
		 
		

		
		
		
		
	   
		
		
		
		
		
		
		
		
		
		
		
	}

}
