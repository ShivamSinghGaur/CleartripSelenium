package pageObjectsTest;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.FlightPage;

public class FlightPageTest extends BaseClass{

	public static FlightPage fpage;
	
	@Test
	public void test2() throws IOException, InterruptedException {
		
		fpage=new FlightPage();
		fpage.takeshotss();
	}
}
