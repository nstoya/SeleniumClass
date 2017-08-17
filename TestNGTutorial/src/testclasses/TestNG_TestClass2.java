package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass2 {
	
	@BeforeClass
	public void setup(){
		System.out.println("Running > TestNG_TestClass2 > setup beforeClass");
	}
	
	@AfterClass
	public void cleanup(){
		System.out.println("Running > TestNG_TestClass2 > cleanup afterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running > TestNG_TestClass2 > beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running > TestNG_TestClass2 > afterMethod");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Running TestNG_TestClass2 > testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running TestNG_TestClass2 > testMethod2");
	}

}
