package b_Amazon_testclass;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import a_Amazon_pomclass.AccountHomePage_pomclass;
import a_Amazon_pomclass.HomePage_pomclass;
import a_Amazon_pomclass.LoginPage_pomclass;
import a_Amazon_pomclass.ProductDetailsPage_pomclass;
import a_Amazon_pomclass.ProductPage_pomclass;

public class verify_AddtoCart_Product_testclass3 extends BasePage {
@Test
	public void verify_product_details()  {
	   
		
		
	HomePage_pomclass HomePage_pomclass=new HomePage_pomclass( page);
	LoginPage_pomclass LoginPage_pomclass= new LoginPage_pomclass(page);
	AccountHomePage_pomclass AccountHomePage_pomclass=new AccountHomePage_pomclass(page);
//	ProductPage_pomclass ProductPage_pomclass=new ProductPage_pomclass(page);
	ProductDetailsPage_pomclass ProductDetailsPage_pomclass=new ProductDetailsPage_pomclass(page);
	
	
	HomePage_pomclass.clickonAccountList();
	LoginPage_pomclass.login("9623593995","Akshay@10");
	AccountHomePage_pomclass.login("iphone17");
	//page.pause();
	page.waitForTimeout(3000);
	AccountHomePage_pomclass.autosuggestion("iphone 17 pro max");
	
	ProductDetailsPage_pomclass.multiwindow(page,context);
		
	
	PlaywrightAssertions.assertThat(ProductDetailsPage_pomclass.getProductTitle()).hasText("Apple iPhone Air 1 TB: Thinnest iPhone Ever, 16.63 cm (6.5″) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space Black");
	PlaywrightAssertions.assertThat(ProductDetailsPage_pomclass.getprice()).hasText("1,41,900");
	ProductDetailsPage_pomclass.clickOnAddtoCartbtn();
	PlaywrightAssertions.assertThat(ProductDetailsPage_pomclass.verifyaddtocart()).hasText("1");
	ProductDetailsPage_pomclass.clickOncartbucket();
	ProductDetailsPage_pomclass.clickOncartdeletebtn();
	
	
	
}
	
}
