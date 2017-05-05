package page.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPage;

public class PageObjectModel {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.de/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}


	
	@Test
	public void test() {
		driver.get(baseURL);
		
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.originTextBox(driver).sendKeys("New York");
		SearchPage.destinationTextBox(driver).sendKeys("Chikago");
		SearchPage.departrureDateTextBox(driver).sendKeys("25.12.2017");
		SearchPage.returnDateTextBox(driver).sendKeys("31.12.2017");
		SearchPage.clickOnSearchButton(driver);
		
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
