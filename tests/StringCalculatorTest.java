import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator calc = new StringCalculator();

	@Test
	public void StringCalculatorTest_EmptyString() {
		int result = calc.add("");
		assertEquals("Empty string returns wrong value", 0, result);
	}
	
	@Test
	public void StringCalculatorTest_NonEmptyString() {
		int result = calc.add("1,2");
		assertTrue("Non Empty string returns wrong value", 0 != result);
	}
	
	@Test
	public void StringCalculatorTest_invalid_string() {
		int result = calc.add("asdasd");
		assertTrue("Non Empty string returns wrong value", 0 != result);
	}

}
