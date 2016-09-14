import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_nullString() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add(null);
		assertEquals(0, result);
	}

	@Test
	public void test_emptyString() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("");
		assertEquals(0, result);
	}
	
	@Test
	public void test_OneNumber() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("42");
		assertEquals(42, result);
	}
}
