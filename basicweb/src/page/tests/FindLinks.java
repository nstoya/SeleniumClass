package page.tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPage;
import page.classes.SearchPageFactory;

public class FindLinks {
	
	WebDriver driver;
	String baseURL;
	//SearchPageFactory searchPage;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.de/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		//searchPage = new SearchPageFactory(driver);
		
	}


	@Test
	public void test() {
		SearchPage.navigateToFlightsTab(driver);
		
		List<WebElement> linksList = clicableLinks(driver);
		
		for (WebElement link: linksList){
			String href = link.getAttribute("href");
			try {
				System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		

	}


	public static List<WebElement> clicableLinks(WebDriver driver){
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
	
		for (WebElement e: elements){
			if (e.getAttribute("href") != null){
				linksToClick.add(e);
			}
		}
		
		return linksToClick;
	}
	
	public static String linkStatus(URL url){
		try {
			
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			http.connect();
			String responseMessage = http.getResponseMessage();
			http.disconnect();
			
			return responseMessage;
		
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
