package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingBetweenPages {
	private WebDriver driver;
	private String baseUrl;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().back();
		currentUrl = driver.getCurrentUrl();
		
		driver.navigate().refresh();
		driver.get(currentUrl);
		
		driver.getPageSource();
		
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
