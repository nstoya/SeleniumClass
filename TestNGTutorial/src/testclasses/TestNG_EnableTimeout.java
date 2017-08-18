package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeout {


	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test (enabled=false)
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test (timeOut=300)
	public void testMethod2() {
		System.out.println("testMethod2");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
