import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testStringCalculator_EmptyString() throws StringCalculatorException {
		// Arrange
		String numbers = "";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Empty string", 0, sum);
	}

	@Test
	public void testStringCalculator_OneNumber() throws StringCalculatorException {
		// Arrange
		String numbers = "5";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("One number (5)", 5, sum);
	}

	@Test
	public void testStringCalculator_OneNumber_2() throws StringCalculatorException {
		// Arrange
		String numbers = "37";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("One number (37)", 37, sum);
	}

	@Test
	public void testStringCalculator_TwoNumbers() throws StringCalculatorException {
		// Arrange
		String numbers = "3,9";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Two numbers (3, 9)", 12, sum);
	}

	@Test
	public void testStringCalculator_TwoNumbers_2() throws StringCalculatorException {
		// Arrange
		String numbers = "50,0";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Two numbers (50, 0)", 50, sum);
	}

	@Test
	public void testStringCalculator_ManyNumbers() throws StringCalculatorException {
		// Arrange
		String numbers = "7,7,16";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Many numbers (7, 7, 16)", 30, sum);
	}

	@Test
	public void testStringCalculator_ManyNumbers_2() throws StringCalculatorException {
		// Arrange
		String numbers = "1,2,3,4,5,6,7,8,9,100";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Many numbers (1...9, 100)", 145, sum);
	}

	@Test
	public void testStringCalculator_TwoNumbers_ManyCommas() throws StringCalculatorException {
		// Arrange
		String numbers = "5,,,8";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Two numbers, many commas (\"5,,,8\")", 13, sum);
	}

	@Test
	public void testStringCalculator_ManyNumbers_ManyCommas() throws StringCalculatorException {
		// Arrange
		String numbers = "1,,2,6,,0";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Two numbers, many commas (\"1,,2,6,,0\")", 9, sum);
	}
}
