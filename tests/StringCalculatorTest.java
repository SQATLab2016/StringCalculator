import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	// TEST ADD BEGIN
	
	@Test (expected = StringCalculatorException.class)
	public void test_return_zero_null_string() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		//assertEquals("zero", 0, strcalc.add(null));
		int a = strcalc.add(null);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void test_return_zero_empty_string() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		//assertEquals("zero", 0, strcalc.add(""));
		int a = strcalc.add("");
	}

	@Test (expected = StringCalculatorException.class)
	public void test_return_zero_invalid_string() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		//assertEquals("zero", 0, strcalc.add("as2"));
		int a = strcalc.add("as2");
	}
	
	@Test
	public void test_return_two_string_1_1() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return two.", 2, strcalc.add("1,1"));
	}
	
	@Test
	public void test_return_five_string_2_3() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return five.", 5, strcalc.add("2,3"));
	}
	
	@Test
	public void test_return_three_string_3() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return three.", 3, strcalc.add("3"));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_return_exception_string_negative() throws StringCalculatorException {
		StringCalculator strcalc = new StringCalculator();
		int a = strcalc.add("-3");
	}
	
	// TEST ADD END.
	
	// TEST ADDUNLIMITED BEGIN
	
	@Test
	public void test_unlimited_return_5_string_1_1_1_1_1() {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return five.", 5, strcalc.addUnlimited("1,1,1,1,1"));
	}
	
	// TEST ADDUNLIMITED END.
	
	// TEST ADDNEWCHAR BEGIN
	
	@Test
	public void test_newline_return_5_string_1_1_1_1_1() {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return five.", 5, strcalc.addUsingNewline("1\n1\n1\n1\n1"));
	}
	
	@Test
	public void test_newline_return_6_string_1_newline_2_3() {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return six.", 6, strcalc.addUsingNewline("1\n2,3"));
	}
	
	@Test
	public void test_newline_return_0_string_1_newline_comma_3() {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return zero.", 0, strcalc.addUsingNewline("1\n,"));
	}
	
	@Test
	public void test_newline_return_10_string_1_newline_2_newline_3_comma_3_comma_1() {
		StringCalculator strcalc = new StringCalculator();
		assertEquals("Should return ten.", 10, strcalc.addUsingNewline("1\n2\n3,3,1"));
	}
	
	// TEST ADDNEWCHAR END.
	
	
	
	
}
