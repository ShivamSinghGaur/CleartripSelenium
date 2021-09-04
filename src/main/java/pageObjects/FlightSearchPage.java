package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import utilities.DatePick;
import utilities.ExcelData;
import utilities.ScrollPage;

public class FlightSearchPage extends BaseClass{
	
	public FlightSearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="radio__circle")
	List<WebElement> radio;
	
	@FindBy(className="field")
	List<WebElement> citydrop;
	
	@FindBy(css=".bg-white.br-4")
	WebElement fromcity;
	
	@FindBy(css=".bg-white.br-4")
	WebElement tocity;
	
	@FindBy(className="homeCalender")
	WebElement dateselection;
	
	@FindBy(tagName="select")
	List<WebElement> adults;
	
	@FindBy(css=".px-7.bg-primary-500")
	WebElement searchflight;
	
	//Actions
	public void radio() throws InterruptedException {
		
		ScrollPage.scrolldown();
		Thread.sleep(2000);
		radio.get(1).click();
	}
	public void fromcity() throws InterruptedException, IOException {
			
			citydrop.get(0).sendKeys(ExcelData.getdata(0,0));
			Thread.sleep(2000);
			fromcity.findElement(By.tagName("li")).click();
		}
	public void tocity() throws InterruptedException, IOException {
		
		citydrop.get(1).sendKeys(ExcelData.getdata(1,0));
		Thread.sleep(2000);
		tocity.findElement(By.tagName("li")).click();
	}
	public void dateselection() throws InterruptedException {
		
		dateselection.findElements(By.tagName("button")).get(0).click();
		Thread.sleep(1000);
		DatePick.dateselection("August 2021","13","November 2021","19");
	}
	public void adults() throws InterruptedException {
		
		Select select= new Select(adults.get(0));
		Thread.sleep(1000);
		select.selectByValue("2");
	}
	public void searchflight() throws InterruptedException {
		
		Thread.sleep(1000);
		searchflight.click();
	}

		
}

