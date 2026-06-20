package a_Amazon_pomclass;

import java.awt.print.Pageable;
import java.security.KeyStore.PrivateKeyEntry;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage_pomclass {
	
	private Locator AccountList;
	
	
	public HomePage_pomclass(Page page)
	{
		AccountList =page.locator("//div[@id='nav-link-accountList']//a[contains(@class,'nav-progressive-attribute')]");
	}

   
	 public void clickonAccountList()
	 {
		 AccountList.click(); 
	 }






}
