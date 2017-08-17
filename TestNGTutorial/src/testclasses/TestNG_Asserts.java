package testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SimpleClassToTest;

public class TestNG_Asserts {
  
	
	@Test
	public void testSum(){
		System.out.println("Runnint Test -> testSum");
		SimpleClassToTest obj = new SimpleClassToTest();
		int result = obj. sumNumbers(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testStrings(){
		System.out.println("Running Test -> addSrings");
		SimpleClassToTest obj = new SimpleClassToTest();
		String resultString = obj.addStrings("Hello", "World");
		assertEquals(resultString, "Hello World");
	}
	
	@Test
	public void testArray(){
		System.out.println("Running Test -> testArray");
		SimpleClassToTest obj =  new SimpleClassToTest();
		int[] array = obj.getArray();
		int[] expected = {1,2,3,4};
 		assertEquals(expected,  array);
				
	}
}
