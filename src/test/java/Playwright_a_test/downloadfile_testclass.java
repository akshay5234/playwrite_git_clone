package Playwright_a_test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import playwright_a_pom.downloadfile_pomclass;
import playwright_a_pom.login_pomClass;

public class downloadfile_testclass {
	 public Download download;
    @Test	
	public  void login_testclass1() throws IOException
	{
	   Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));	
 	   Page page= browser.newPage();
 	   page.navigate("https://the-internet.herokuapp.com/download");
 	  downloadfile_pomclass  downloadfile_pomclass =new downloadfile_pomclass(page);
	
 	   download= page.waitForDownload(()->
 	    { 
 	    	downloadfile_pomclass.clicondownloadfile();
 	   });
 	  
 	 
    //	downloadfile_pomclass.other() ;
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
	    
	
	  
	
	
	}
	
}
