package pageObjects;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utilities.ScreenShot;
import utilities.ScrollPage;

public class FlightPage extends BaseClass{
	
public FlightPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void takeshotss() throws IOException, InterruptedException {
		
		Thread.sleep(10000);
		ScreenShot.takeshot("flightlist1");
		ScrollPage.scrolldownflight();
		Thread.sleep(2000);
		ScreenShot.takeshot("flightlist2");
	}

}
