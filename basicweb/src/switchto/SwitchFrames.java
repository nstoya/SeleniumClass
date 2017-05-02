package switchto;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrames {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}

	@Test
	public void test() {
		
		//switch using frame id
		//driver.switchTo().frame("courses-iframe");
		
		//switch using frame name		
		//driver.switchTo().frame("iframe-name");
		
		//switch using frame number
		driver.switchTo().frame(0);
		
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("python");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("test");;
		
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
