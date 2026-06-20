package playwright_a_pom;

import java.awt.print.Pageable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class downloadfile_pomclass {

  private Locator downloadfileclick;
  private Download download;
  
	



      public downloadfile_pomclass(Page page)
      {
    	  downloadfileclick = page.locator("xpath=//a[text()='test_upload.txt']");  	     
    		 
      }
      
      public void clicondownloadfile()
      {   	   	   
  	    	downloadfileclick.click(); 	    
      }

      
      public void other() throws IOException
      {
    	  String downloadpath = System.getProperty("user.dir")+"/download/"+download.suggestedFilename();
    		 System.out.println(downloadpath);
    		System.out.println(download.suggestedFilename());
    		System.out.println(download.url());  
    		System.out.println(download.path());
    		
    		download.saveAs(Paths.get(downloadpath)) ;
    		
    		if(downloadpath.endsWith(".txt")) {
    			
    			System.out.println("file extension is verifid");
    		}
    		else {
    			
    				System.out.println("file extension is failed");
    				
    			}
    	        String datafromfile="empty";
    			
    				datafromfile = Files.readString(Path.of(downloadpath));
    			
    		

    	         System.out.println(datafromfile);
    		
    		    if(datafromfile.contains("file")) {
    		    	System.out.println("pass content test");
    		    }
    		    else {
    				System.out.println("Fail content test");
    			}
    		    
    		
    		
    	//	browser.close();
    		  
      }

     









}
