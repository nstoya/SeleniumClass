package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public static WebElement originTextBox(WebDriver driver){
		return driver.findElement(By.id("flight-origin-hp-flight"));
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin){
		originTextBox(driver).sendKeys(origin);
	}
	
	public static WebElement destinationTextBox(WebDriver driver){
		return driver.findElement(By.id("flight-destination-hp-flight"));
	}
	
	public static WebElement departrureDateTextBox(WebDriver driver){
		return driver.findElement(By.id("flight-departing-hp-flight"));
	}
	
	public static WebElement returnDateTextBox(WebDriver driver){
		return driver.findElement(By.id("flight-returning-hp-flight"));
	}
	
	public static WebElement searchButton(WebDriver driver){
		return driver.findElement(By.xpath(".//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']"));
	}
	
	public static void clickOnSearchButton(WebDriver driver){
		searchButton(driver).click();
	}
	
	public static void navigateToFlightsTab(WebDriver driver){
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}
	
	
	
	

	
}
