package testclasses;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import appcode.SimpleClassToTest;

public class TestNG_softAsserts {
  
	@Test
	public void testSum() {
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Running Test > testSum");
		SimpleClassToTest obj = new SimpleClassToTest();
		int result = obj.sumNumbers(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("Line after Assert 1");
		sa.assertEquals(result, 3);
		System.out.println("Line after Assert 2");
		sa.assertAll();
	}
}
