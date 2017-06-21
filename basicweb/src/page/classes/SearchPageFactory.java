package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	//@FindBy(id="header-account-menu")
	//WebElement headerAccount;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	
	@FindBy (id="flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;
	
	@FindBy(id="flight-type-multi-dest-label-hp-flight")
	WebElement multipleDestination;
	
	@FindBy (id="flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	

	@FindBy (id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	@FindBy(xpath=".//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab(){
		//headerHistory.click();
		flightTab.click();
	}
	
	public void setOriginCity(String origin){
		originCity.sendKeys(origin);
	}
	
	public void setDestinationSity(String destination){
		destinationCity.sendKeys(destination);
	}
	
	
	public void clickRoundTrip(){
		roundTrip.click();
	}
	
	public void clickMultipleDestination(){
		multipleDestination.click();
	}
}
