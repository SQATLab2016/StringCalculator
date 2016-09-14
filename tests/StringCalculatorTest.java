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
		assertEquals("Many numbers, many commas (\"1,,2,6,,0\")", 9, sum);
	}

	@Test
	public void testStringCalculator_ManyNumbers_NewlineAndComma() throws StringCalculatorException {
		// Arrange
		String numbers = "1,2\n6";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Many numbers, newline and comma (\"1,2\\n,6\")", 9, sum);
	}

	@Test
	public void testStringCalculator_ManyNumbers_NewlinesOnly() throws StringCalculatorException {
		// Arrange
		String numbers = "1\n0\n\n8\n10";
		
		// Act
		int sum = StringCalculator.add(numbers);
		
		// Assert
		assertEquals("Many numbers, newlines only (\"1\\n0\\n\\n8\\n10\")", 19, sum);
	}

	@Test (expected = StringCalculatorException.class)
	public void testStringCalculator_NewlineAndCommaNextToEachOther() throws StringCalculatorException {
		// Arrange
		String numbers = "1\n,2";
		
		// Act, should raise an exception
		StringCalculator.add(numbers);
	}

	@Test (expected = StringCalculatorException.class)
	public void testStringCalculator_CommaAndNewlineNextToEachOther() throws StringCalculatorException {
		// Arrange
		String numbers = "3,\n4";
		
		// Act, should raise an exception
		StringCalculator.add(numbers);
	}

	@Test (expected = StringCalculatorException.class)
	public void testStringCalculator_OneNegativeNumber() throws StringCalculatorException {
		// Arrange
		String numbers = "-100";
		
		// Act, should raise an exception
		StringCalculator.add(numbers);
	}

	@Test (expected = StringCalculatorException.class)
	public void testStringCalculator_WithNegativeNumber() throws StringCalculatorException {
		// Arrange
		String numbers = "4,-5";
		
		// Act, should raise an exception
		StringCalculator.add(numbers);
	}

	@Test (expected = StringCalculatorException.class)
	public void testStringCalculator_IllegalCharacters() throws StringCalculatorException {
		// Arrange
		String numbers = "1,3.6";
		
		// Act, should raise an exception
		StringCalculator.add(numbers);
	}

	@Test (expected = StringCalculatorException.class)
	public void testStringCalculator_IllegalCharacters_2() throws StringCalculatorException {
		// Arrange
		String numbers = "1,3,6,5e2";
		
		// Act, should raise an exception
		StringCalculator.add(numbers);
	}
}
