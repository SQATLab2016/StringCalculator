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

	@Test
	public void testStringCalculator_OneNumber() {
		// Arrange
		String numbers = "5";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("One number (5)", 5, sum);
	}

	@Test
	public void testStringCalculator_OneNumber_2() {
		// Arrange
		String numbers = "37";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("One number (37)", 37, sum);
	}

	@Test
	public void testStringCalculator_TwoNumbers() {
		// Arrange
		String numbers = "3,9";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Two numbers (3, 9)", 12, sum);
	}

	@Test
	public void testStringCalculator_TwoNumbers_2() {
		// Arrange
		String numbers = "50,0";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Two numbers (50, 0)", 50, sum);
	}

	@Test
	public void testStringCalculator_ManyNumbers() {
		// Arrange
		String numbers = "7,7,16";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Many numbers (7, 7, 16)", 30, sum);
	}

}
