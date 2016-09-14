import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testStringCalculator_EmptyString() {
		// Arrange
		String numbers = "";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Empty string", 0, sum);
	}

}
