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
	
	@Test
	public void StringCalculatorTest_invalid_string() throws StringCalculatorException {
		int result = calc.add("asdasd");
		assertTrue("Non Empty string returns wrong value", 0 != result);
	}

}
