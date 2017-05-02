package switchto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
	
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
	public void test() throws InterruptedException {

		String parentHandle = driver.getWindowHandle();

		System.out.println("Parent handle: " + parentHandle);
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				WebElement searchbox = driver.findElement(By.id("search-courses"));
				searchbox.sendKeys("python");
				driver.close(); // closes the current focused window, only quits
								// browser only if the current window is the
								// last open
				break;
			}
		}

		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("test");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
