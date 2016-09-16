import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator calc = new StringCalculator();

	@Test
	public void StringCalculatorTest_EmptyString() throws StringCalculatorException  {
		int result = calc.add("");
		assertEquals("Empty string returns wrong value", 0, result);
	}

	@Test
	public void StringCalculatorTest_NonEmptyString() throws StringCalculatorException  {
		int result = calc.add("1,2");
		assertTrue("Non Empty string returns wrong value", 0 != result);
	}

	@Test(expected=StringCalculatorException.class)
	public void StringCalculatorTest_invalid_string() throws StringCalculatorException {
		int result = calc.add("asdasd");
	}

	@Test(expected=StringCalculatorException.class)
	public void StringCalculatorTest_invalid_numbers() throws StringCalculatorException  {
		int result = calc.add("3,2");
	}
	
	@Test
	public void StringCalculatorTest_1_2_3() throws StringCalculatorException  {
		int result = calc.add("1,2");
		assertTrue("1 + 2 returns a wrong answer " + result, result == 3);
	}
	
	@Test
	public void StringCalculatorTest_1_2_2_5() throws StringCalculatorException  {
		int result = calc.add("1,2,2");
		assertTrue("1 + 2 + 2 returns a wrong answer " + result, result == 5);
	}
	
	@Test
	public void StringCalculatorTest_1_0_0_1() throws StringCalculatorException  {
		int result = calc.add("1,0,0");
		assertTrue("1 + 0 + 0 returns a wrong answer " + result, result == 1);
	}
	
	@Test
	public void StringCalculatorTest_0_0_0() throws StringCalculatorException  {
		int result = calc.add("0,0");
		assertTrue("0 + 0 returns a wrong answer " + result, result == 0);
	}
	
	@Test
	public void StringCalculatorTest_0() throws StringCalculatorException  {
		int result = calc.add("0");
		assertTrue("0 returns a wrong answer " + result, result == 0);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void StringCalculatorTest_negative() throws StringCalculatorException  {
		int result = calc.add("-1,0");
	}
	
	@Test
	public void StringCalculatorTest_1_1_1_1_1_5() throws StringCalculatorException  {
		int result = calc.add("1,1,1,1,1");
		assertTrue("1+1+1+1+1 returns a wrong answer " + result, result == 5);
	}
	
	@Test
	public void StringCalculatorTest_1_2_3_new_line() throws StringCalculatorException  {
		int result = calc.add("1\n2");
		assertTrue("1 + 2 with new line returns a wrong answer " + result, result == 3);
	}

}
