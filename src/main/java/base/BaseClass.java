package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	@Parameters("browser")
	@BeforeSuite
	public void setup(String browser) throws IOException {
		
		FileInputStream f=new FileInputStream("./data.properties");
		prop=new Properties();
		prop.load(f);
		
		try {
			
			if(browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", prop.getProperty("foxpath"));
				driver = new FirefoxDriver();
			}
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}
