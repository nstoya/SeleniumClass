package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNG_Priority {

	@BeforeClass
	public void setup(){
		System.out.println("TestNG_Priority > beforeClass");
	}
	
	@AfterClass
	public void cleanup(){
		System.out.println("TestNG_Priority > afterClass");
	}
	
	@Test(priority=2)
	public void TestMethod1() {
		System.out.println("TestNG_Priority > TestMethod1");
	}

	@Test(priority=1)
	public void TestMethod2() {
		System.out.println("TestNG_Priority > TestMethod2");
	}
	
	@Test(priority=0)
	public void TestMethod3() {
		System.out.println("TestNG_Priority > TestMethod3");
	}
	

}
