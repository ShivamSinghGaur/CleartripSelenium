package pageObjectsTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.FlightSearchPage;
import utilities.ScrollPage;

public class FlightSearchPageTest extends BaseClass{
	
	public static FlightSearchPage flight;
	
	@Test
	public void test1() throws InterruptedException, IOException {
		
		flight=new FlightSearchPage();
		flight.radio();
		flight.fromcity();
		flight.tocity();
		flight.dateselection();
		flight.adults();
		flight.searchflight();
		
	}

}
