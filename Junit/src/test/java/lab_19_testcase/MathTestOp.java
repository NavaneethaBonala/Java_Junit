package lab_19_testcase; //User Defined Package Declaration

// import Built in packages
import static org.junit.jupiter.api.Assertions.assertEquals; 

import org.junit.jupiter.api.Test;

import lab_19_Junit_MathOperation.MathOperations;

public class MathTestOp { // Class Declaration

	// Test method to Test Add method
	@Test
	public void testMethod()
	{
		MathOperations calc = new MathOperations();
		
		assertEquals(calc.add(10, 8), 18);
	}
	
	// Test method to Test Multiply method
	@Test
	public void testMethod1()
	{
		MathOperations calc = new MathOperations();
		
		assertEquals(calc.multiply(10, 8), 80);
	}
	
	// Test method to Test Substract method
	@Test
	public void testMethod2()
	{
		MathOperations calc = new MathOperations();
		
		assertEquals(calc.sub(10, 8), 2);
	}
	
	// Test method to Test Division method
	@Test
	public void testMethod3()
	{
		MathOperations calc = new MathOperations();
		
		assertEquals(calc.div(10, 8), 18);
	}
}
