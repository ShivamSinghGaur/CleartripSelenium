package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;

public class ScreenShot extends BaseClass{

	public static void takeshot(String shotname) throws IOException {
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		File f1=shot.getScreenshotAs(OutputType.FILE);
		File f2=new File("./screenshots/"+shotname+".jpg");
		FileUtils.copyFile(f1, f2);
	}
	
}
