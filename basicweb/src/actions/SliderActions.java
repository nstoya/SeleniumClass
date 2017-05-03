package actions;

import java.sql.DriverPropertyInfo;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://jqueryui.com/slider/";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}

	@Test
	public void test() throws InterruptedException {
	
		driver.switchTo().frame(0);		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 500, 0).perform();
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}	
	
}
