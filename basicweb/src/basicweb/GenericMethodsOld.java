package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethodsOld {
	
	WebDriver driver;
	
	public GenericMethodsOld(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElement(String locator, String type){
		type = type.toLowerCase();
		if (type.equals("id")){
			System.out.println("Element found with id: " + type);
			return this.driver.findElement(By.id(locator));
		}
		if (type.equals("xpath")){
			System.out.println("Element found with xpath: " + type);
			return this.driver.findElement(By.xpath(locator));
		}
		else{
			
			System.out.println("locator type not supported");
			return null;
		}
		
	}
	
	public List<WebElement> getElementList(String locator, String type){
		type = type.toLowerCase();
		if (type.equals("id")){
			System.out.println("Element List found with id: " + locator);
			return this.driver.findElements(By.id(locator));
		}
		if (type.equals("xpath")){
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElements(By.xpath(locator));
		}
		else{
			
			System.out.println("locator type not supported");
			return null;
		}
		
	}

	public boolean isElementPresent(String locator, String type){
		List<WebElement> elementList = getElementList(locator, type);
		
		int size = elementList.size();
		
		return size > 0;
	}
}
