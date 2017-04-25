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

public class CalendarDemo {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.de/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	//@Test
	public void test1() {
		driver.get(baseURL);
		
		//click on Departing field
		WebElement departField = driver.findElement(By.id("package-departing-hp-package"));
		departField.click();
		
		
		//select a Date
		WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]/table//button[text()='29']"));
		
		dateToSelect.click();
	}
	
	@Test
	public void test2() {
		driver.get(baseURL);
		
		WebElement departField = driver.findElement(By.id("package-departing-hp-package"));
		departField.click();
		//WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]/table//button[text()='29']"));
		//dateToSelect.click();
		
		WebElement calMonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]"));
		List<WebElement> validDates = calMonth.findElements(By.tagName("td"));
		
		for(WebElement date: validDates){
			if (date.getText().equals("30")){
				date.click();
				break;
			}
				
		}
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
