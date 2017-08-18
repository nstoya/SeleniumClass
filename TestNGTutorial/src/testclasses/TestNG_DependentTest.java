package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import appcode.SimpleClassToTest;

public class TestNG_DependentTest {
	
	SimpleClassToTest obj;
	
	@BeforeClass
	public void beforeClass() {
		obj = new SimpleClassToTest();
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test (dependsOnMethods={"testMethod2"}, alwaysRun=true)
	public void testMethod1() {
		System.out.println("TestMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestMethod2");
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 2);
	}
	
	@Test (dependsOnMethods={"testMethod1"})
	public void testMethod3() {
		System.out.println("TestMethod3");
	}
	
	@Test 
	public void testMethod4() {
		System.out.println("TestMethod4");
	}
}
