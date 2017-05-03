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

public class DragNDropAction {
	WebDriver driver;
	String baseURL;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "http://jqueryui.com/droppable/";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseURL);
		js = (JavascriptExecutor)driver;
		
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//direct dragAndDrop
		//action.dragAndDrop(draggable, droppable).perform();
		
		//manually
		action.clickAndHold(draggable).moveToElement(droppable).release().perform();
		
		WebElement body = driver.findElement(By.xpath("//body"));
		action.dragAndDrop(draggable, body).perform();
		
		
		
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
