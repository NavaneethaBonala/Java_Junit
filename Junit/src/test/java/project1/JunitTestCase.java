package project1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class JunitTestCase
{
	@Test
	public void testMethod()
	{
		Calculator calc = new Calculator();
		
		assertEquals(calc.add(10, 8), 18);
		
	}
	@Disabled
	@Test
	public void testMethod1()
	{
		Calculator calc = new Calculator();
		
		assertEquals(calc.multiply(10, 8), -80);
		
	}
	@RepeatedTest(value=2)
	public void testMethod2()
	{
		Calculator calc = new Calculator();
		
		assertEquals(calc.multiply(10, 0), 0);
		
	}
	
	public void msg1()
	{
		System.out.println("not a testing method");
	}
	
}