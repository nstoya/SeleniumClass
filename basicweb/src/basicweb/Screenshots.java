package basicweb;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;

public class Screenshots {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.de/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test1() {
		driver.get(baseURL);
		
		//click on Departing field
		WebElement departTab = driver.findElement(By.id("tab-flight-tab-hp"));
		WebElement departureAirport = driver.findElement(By.id("flight-origin-hp-flight"));
		WebElement arrivalAirport = driver.findElement(By.id("flight-destination-hp-flight"));
		WebElement departureDate = driver.findElement(By.id("flight-departing-hp-flight"));
		WebElement arrivalDate = driver.findElement(By.id("flight-returning-hp-flight"));
		WebElement searchButton = driver.findElement(By.xpath(".//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']"));
		
		departTab.click();
		departureAirport.sendKeys("Bonn");
		arrivalAirport.sendKeys("Bonn");
		departureDate.sendKeys("01.05.2017");
		arrivalDate.sendKeys("01.05.2017");
		searchButton.click();
	}
	
	@After
	public void tearDown() throws Exception {
		String filename = new Random().nextInt(100000000) + ".png";
		String directory = "C:\\repos\\test\\results\\";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory+filename));
		
		Thread.sleep(3000);
		driver.quit();
	}
}
