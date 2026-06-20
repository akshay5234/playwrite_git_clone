package a_Amazon_pomclass;

import java.awt.print.Pageable;
import java.security.KeyStore.PrivateKeyEntry;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage_pomclass {
	
	private Locator Enter_mobile_no;
	private Locator continuebtn;
	private Page page;
	private Locator verifybtn;
	private Locator password;
	private Locator signinbtn;
	
	public LoginPage_pomclass(Page page)
	{
		Enter_mobile_no =page.locator("//input[@id='ap_email_login']");
		continuebtn=page.locator("//input[@type='submit']");
		verifybtn=page.locator("//input[@aria-label='Verify OTP Button']");
		password=page.locator("//input[@id='ap_password']");
		signinbtn=page.locator("//input[@id='signInSubmit']");
				
		//input[@id='signInSubmit']
		//this.page=page	
	}

   
	 public void login(String mobileno,String pwd)
	 {
		 Enter_mobile_no.fill(mobileno);
		 continuebtn.click();
		 password.fill(pwd);
		 signinbtn.click();
	//	 this.page.waitForTimeout(5000);
	//	 verifybtn.click();
	 }






}
