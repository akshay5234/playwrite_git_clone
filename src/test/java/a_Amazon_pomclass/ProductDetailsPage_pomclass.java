package a_Amazon_pomclass;

import java.awt.print.Pageable;
import java.security.KeyStore.PrivateKeyEntry;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ProductDetailsPage_pomclass {
	
	private Locator productTitle;

	private Locator productitem;
	private Locator continuebtn;
	protected Page page;
	protected BrowserContext context;
	private Locator verifybtn;
	private Page  newpage;
	private Locator producttitle;
	private Locator price;
	protected Locator clickOnAddtoCartbtn;
	private Locator verifyaddtocart;
	private Locator cartbucket;
	private Locator cartdeletebtn;
	
	
	public ProductDetailsPage_pomclass(Page page)
	{
		
		productitem =page.locator("(//span[text()='1,41,900'])[1]");
	    
	}

   
	public void multiwindow(Page newpage,BrowserContext context)
	{ 
		  newpage= context.waitForPage(()->		  
		  {
			  productitem.click();
		  } );
			 producttitle =newpage.locator("//span[@id='productTitle']") ;	
			 price =newpage.locator("//span[normalize-space()='1,41,900']") ;
			 clickOnAddtoCartbtn =newpage.locator("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']");
			 verifyaddtocart=newpage.locator("//span[@id='nav-cart-count']");
			 cartbucket=newpage.locator("//span[@class='a-button a-button-primary attach-button-large attach-primary-cart-button']//input[@type='submit']");
			// cartdeletebtn=newpage.locator("//button[@aria-label='Delete Apple iPhone Air 1 TB: Thinnest iPhone Ever, 16.63 cm (6.5&Prime;) Display with Promotion up to 120Hz, Powerful A19 Pro Chip, Center Stage Front Camera, All-Day Battery Life; Space Black']//span[@data-a-selector='button-touch-target']");
			 cartdeletebtn= newpage.getByLabel("Shopping Cart", new Page.GetByLabelOptions().setExact(true)).getByText("Delete");
			
	}
	
	   public Locator verifyaddtocart() {
		
		
		return verifyaddtocart;
	   }

	 public Locator getProductTitle()
	    {
		 System.out.println(producttitle.textContent());
	    	return producttitle;
	    }
    
	 
	   public Locator getprice()
	 {
		 System.out.println(price.textContent());
	    	 return price;
	    }
    
	  public void clickOnAddtoCartbtn()
	   {
		 clickOnAddtoCartbtn.click(); 
	    }

	  public void clickOncartbucket()
	   {
		  cartbucket.click(); 
	    }
	  public void clickOncartdeletebtn()
	   {
		  cartdeletebtn.click(); 
	    }
	 
	 
	 
}
