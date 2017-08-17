package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_MethodClassAnnotations {

	@BeforeClass
	public void setup(){
		System.out.println("Running > setup beforeClass");
	}
	
	@AfterClass
	public void cleanup(){
		System.out.println("Running > cleanup afterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running > beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running > afterMethod");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Running > testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running > testMethod2");
	}



}
