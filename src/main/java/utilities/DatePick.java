package utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class DatePick extends BaseClass{
	
	public static void dateselection(String departmonth,String departdate,String returnmonth,String returndate) throws InterruptedException {
		
		WebElement panel=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]"));
		//System.out.println(panel.findElements(By.tagName("svg")).size());
		//panel.findElements(By.tagName("svg")).get(1).click();
		while(true) {
			
			WebElement leftcal=panel.findElements(By.className("DayPicker-Month")).get(0);
			String month=leftcal.findElement(By.className("DayPicker-Caption")).getText();
			if(month.equalsIgnoreCase(departmonth)) {
				
				List<WebElement> dates=leftcal.findElements(By.className("DayPicker-Day"));
				for(WebElement i:dates) {
					
					String date=i.getText();
					if(date.equalsIgnoreCase(departdate)) {
					
						i.click();
						break;
					}
				}
				break;
			}
			else {
				
				panel.findElements(By.tagName("svg")).get(1).click();
				Thread.sleep(1000);
			}
		}
		while(true) {
			
			WebElement rightcal=panel.findElements(By.className("DayPicker-Month")).get(1);
			String month=rightcal.findElement(By.className("DayPicker-Caption")).getText();
			if(month.equalsIgnoreCase(returnmonth)) {
				
				List<WebElement> dates=rightcal.findElements(By.className("DayPicker-Day"));
				for(WebElement i:dates) {
					
					String date=i.getText();
					if(date.equalsIgnoreCase(returndate)) {
						
						Thread.sleep(1000);
						i.click();
						break;
					}
				}
				break;
			}
			else {
				
				panel.findElements(By.tagName("svg")).get(1).click();
				Thread.sleep(1000);
			}
		
	}
	}
}
