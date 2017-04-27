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



public class JavaScriptExecution {
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
		Thread.sleep(3000);
		//WebElement textBox = driver.findElement(By.id("name"));
		WebElement textBox = (WebElement)js.executeScript("return document.getElementById('name');");
		//Thread.sleep(3000);
		textBox.sendKeys("test");
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
