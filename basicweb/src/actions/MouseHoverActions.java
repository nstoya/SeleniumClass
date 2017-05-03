package actions;

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

public class MouseHoverActions {
	WebDriver driver;
	String baseURL;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseURL);
		js = (JavascriptExecutor)driver;
		
	}

	@Test
	public void test() throws InterruptedException {
		
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(2000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		
		WebElement subElem = driver.findElement(By.xpath("//div[@id='block-1069048']//a[text()='Top']"));
		subElem.click();
		action.moveToElement(subElem).perform();
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
