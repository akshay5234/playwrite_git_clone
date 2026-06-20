package a_Amazon_pomclass;

import java.awt.print.Pageable;
import java.security.KeyStore.PrivateKeyEntry;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ProductPage_pomclass {
	
	private Locator productitem;
			
	
	public ProductPage_pomclass(Page page)
	{
		productitem =page.locator("//h2[@aria-label='Sponsored Ad - iPhone 17 Pro Max 256 GB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Cosmic Orange']//span[contains(text(),'iPhone 17 Pro Max 256 GB: 17.42 cm (6.9″) Display ')]");
	      
	}

	
	 public void clickOnProduct()
	 {
		 productitem.click();
	 }

	 




}
