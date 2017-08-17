package base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestSuite {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BaseTestSuite -> BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("BaseTestSuite -> AfterTest");
	}

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BaseTestSuite -> BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("BaseTestSuite -> AfterClass");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BaseTestSuite -> BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("BaseTestSuite -> AfterSuite");
	}

}
