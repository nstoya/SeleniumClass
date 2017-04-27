package javascript;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollElementsIntoView {
	WebDriver driver;
	String baseURL;
	private JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		//driver.get(baseURL);
		js.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
		Thread.sleep(2000);
		
		//Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		
		//Scroll up
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);
		
		//Scroll Element into view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
