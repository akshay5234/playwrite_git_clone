package playwright_a_pom;

import java.awt.print.Pageable;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class login_pomClass {

  private Locator userName;
  private Locator paasword;
  private Locator loginbtn;


      public login_pomClass(Page page)
      {
    	  userName = page.locator("#email1");
    	  paasword = page.locator("#password1");
    	  loginbtn = page.getByText("Sign in").last();
    	     
    		 
      }
      
      public void login(String email,String pwd)
      {
	    userName.fill(email);
	    paasword.fill(pwd);
	    loginbtn.click();
       
      }
    


     









}
