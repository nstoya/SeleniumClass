package basicweb;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsElementPresentDemo {

	WebDriver driver;
	String baseURL;
	GenericMethodsOld gm;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		gm = new GenericMethodsOld(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() {
		driver.get(baseURL);
		
		boolean result = gm.isElementPresent("name", "id"); 
		System.out.println("Element present: " + result);
	
		System.out.println("Element present: " +  gm.isElementPresent("names", "id"));
	
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}


}
