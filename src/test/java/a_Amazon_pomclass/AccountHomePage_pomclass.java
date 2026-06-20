package a_Amazon_pomclass;

import java.awt.print.Pageable;
import java.security.KeyStore.PrivateKeyEntry;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AccountHomePage_pomclass {
	
	private Locator search_keyword_bar;
	private Locator Autosuggestionbar;
	private Page page;

	public AccountHomePage_pomclass(Page page)
	{
		search_keyword_bar =page.locator("//input[@id='twotabsearchtextbox']");
		Autosuggestionbar  = page.locator("//div[@role='row']");
		this.page=page;
	}

   
	 public void login(String search)
	 {
		 search_keyword_bar.waitFor();
		 search_keyword_bar.fill(search);		
	 }
     
	 public void autosuggestion(String auttosuggestionname) 
	 {
		
		 for(int i=0;i<Autosuggestionbar.count();i++)
			{
				
				String text=Autosuggestionbar.nth(i).innerText();
				
				System.out.println(text);
				if (text.contains(auttosuggestionname))
				{
					Autosuggestionbar.nth(i).click();
				}				
			  }
			System.out.println("a");
		 
	
	 
	 
	 }
     





}
