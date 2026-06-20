package playwright_project;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class utility {
	
	public static byte[] captureScreenshot(Page page)
	{
        SimpleDateFormat customformat= new SimpleDateFormat("dd_MM_yy_H_mm_ss");
        Date date =new Date();
       String newDate =customformat.format(date);
		
		byte[] arr=page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("screenshot/"+newDate+".png")));
     
     return arr;
	}

}
