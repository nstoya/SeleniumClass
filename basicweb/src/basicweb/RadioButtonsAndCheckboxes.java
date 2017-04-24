package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsAndCheckboxes {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		//baseURL = "https://letskodeit.teachable.com/p/practice";
		baseURL = "https://www.expedia.de/";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseURL);
	}

	
//	@Test
//	public void test() throws InterruptedException {
//		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
//		bmwRadioBtn.click();
//		System.out.println("BMW Radio: " + bmwRadioBtn.isSelected());
//		
//		
//		Thread.sleep(2000);
//		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
//		benzRadioBtn.click();
//		System.out.println("BMW Radio: " + bmwRadioBtn.isSelected());
//		System.out.println("Benz Radio: " + benzRadioBtn.isSelected());
//		
//		
//		Thread.sleep(2000);
//		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
//		bmwCheckBox.click();
//		System.out.println("BMW Check: " + bmwCheckBox.isSelected());
//		
//		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
//		benzCheckBox.click();
//		System.out.println("Benz Check: " + benzCheckBox.isSelected());
//	}
	
	@Test
	public void expediaTest(){
		
		driver.findElement(By.id("fh-fh-hp-package")).click();
		
		driver.findElement(By.id("fhc-fhc-hp-package")).click();
		driver.findElement(By.id("fc-fc-hp-package")).click();
		driver.findElement(By.id("fh-fh-hp-package")).click();
		
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	
}
