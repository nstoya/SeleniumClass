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

public class HiddenElements {
	WebDriver driver;
	String baseURL1;
	String baseURL2;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL1 = "https://letskodeit.teachable.com/p/practice";
		baseURL2 = "https://www.expedia.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

//	@Test
//	public void testLetsKodeIt() throws InterruptedException {
//		driver.get(baseURL1);
//		
//		WebElement textBox = driver.findElement(By.id("displayed-text"));
//		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
//		
//		driver.findElement(By.id("hide-textbox")).click();
//		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
//		
//		driver.findElement(By.id("show-textbox")).click();
//		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
//	}
//	
	@Test
	public void testExpedia(){
		driver.get(baseURL2);
		
		WebElement ageSelect = driver.findElement(By.id("package-1-age-select-1-hp-package"));
		System.out.println("AgeSelect Displayed: " + ageSelect.isDisplayed());
		
		WebElement childSelect = driver.findElement(By.id("package-1-children-hp-package"));
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
