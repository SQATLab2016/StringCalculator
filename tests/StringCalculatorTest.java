import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_nullString() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add(null);
	}

	@Test
	public void test_emptyString() {
		fail("Not yet implemented");
	}
}
