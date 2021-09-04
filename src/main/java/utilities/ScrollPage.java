package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class ScrollPage extends BaseClass{

	static public void scrolldown() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,300)");
		
	}
	static public void scrolldownflight() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)");
		
	}
	
}
