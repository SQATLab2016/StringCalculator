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
	
	@Test
	public void test_twoNumbers() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("4,2");
		assertEquals(6, result);
	}
	
	@Test
	public void test_twoNumbersWithWhitespace() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add(" 4 , 2 ");
		assertEquals(6, result);
	}
	
	@Test
	public void test_threeNumbers() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("1,2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void test_threeNumbersWithNewLines_Correct() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("1\n2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void test_twoNumbersWithNewLines_Incorrect1() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("1\n,2");
		assertEquals(-1, result);
	}
	
	@Test
	public void test_twoNumbersWithNewLines_Incorrect2() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("1,\n2");
		assertEquals(-1, result);
	}
	
	@Test
	public void test_SevenNumbersWithNewLines() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("1,2\n3,4,5,6\n7");
		assertEquals(28, result);
	}
	
	@Test
	public void test_NumbersAndLetters() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("1,a,43,c");
		assertEquals(-1, result);
	}
	
	@Test
	public void test_NegativeNumbers() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("4,-1,15");
		assertEquals(-1, result);
	}
	
	@Test
	public void test_RandomCharacters() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("4,=3,2?");
		assertEquals(-1, result);
	}
}
