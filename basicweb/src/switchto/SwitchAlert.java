package switchto;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAlert {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name"));
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		
	}
	
	@Test
	public void test2() throws InterruptedException{
		driver.findElement(By.id("name"));
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
