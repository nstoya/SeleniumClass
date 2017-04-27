package basicweb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.southwest.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void testAutocomplete() {
		driver.get(baseURL);
		
		String searchText = "Newark, NJ - EWR";
		String partialText = "New York";
		
		WebElement text = driver.findElement(By.id("air-city-departure"));
		
		text.sendKeys("New York");
		
		System.out.println("Sent partial text");
		
		WebElement element = driver.findElement(By.id("air-city-departure-menu"));
		List<WebElement> results = element.findElements(By.tagName("li"));
				
		for (WebElement elem: results){
			System.out.println(elem.getText());
		}
		
		for (WebElement elem: results){
			if (elem.getText().contains(searchText)){
				elem.click();
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
