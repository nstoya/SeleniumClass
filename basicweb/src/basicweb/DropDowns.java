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
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	WebDriver driver;
	String baseURL1;
	String baseURL2;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL1 = "https://www.expedia.de/";
		baseURL2 = "http://html.com/select-multiple/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

//	@Test
//	public void testDropdown() throws InterruptedException {
//		driver.get(baseURL1);
//		
//		driver.findElement(By.id("tab-flight-tab-hp")).click();
//		
//		Select adults = new Select(driver.findElement(By.id("flight-adults-hp-flight")));
//		Select children = new Select(driver.findElement(By.id("flight-children-hp-flight")));
//		
//		List<WebElement> adultOptions = adults.getOptions();
//
//		
//		for (WebElement elem: adultOptions){
//			System.out.println("Adults Option: " + elem.getText());
//		}
//		
//		//by value
//		adults.selectByValue("3");
//		
//		//by index
//		children.selectByIndex(3);
//	}
	
	@Test
	public void testMultiSelect() throws InterruptedException{
		driver.get(baseURL2);
		
		Select multi  = new Select(driver.findElement(By.xpath("//article[@id='post-291']//select")));
		multi.selectByValue("Andean");
		multi.selectByVisibleText("Lesser flamingo");
		multi.selectByIndex(4);
		Thread.sleep(5000);
		multi.deselectByValue("Andean");
		multi.deselectByIndex(4);
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
