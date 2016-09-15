import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testStringWithNumber() {
		String s = "1";
		StringCalculator SC = new StringCalculator();
		try {
			assertEquals(0, SC.add(s));
		}
		catch (Exception e) {
						
		}
	}
	
	@Test
	public void testStringWithLetter() {
		String s = "a";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			//System.out.println(e.toString());
			thrown = true;
		}
		assertEquals("exception thrown", true, thrown);
	}
	
	@Test
	public void testStringWithComma() {
		String s = ",";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			thrown = true;
		}
		assertEquals("comma first", true, thrown);
	}
	
	@Test
	public void testStringWithNewLine() {
		String s = "\n";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			thrown = true;
		}
		assertEquals("new line first", true, thrown);
	}
	
	@Test
	public void testStringWithNegativeNumber() {
		String s = "-1";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			thrown = true;
		}
		assertEquals("negative number", true, thrown);
	}
	
	@Test
	public void testStringWithCommaNewLineCombination() {
		String s = "1,\n";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			//System.out.println(e.toString());
			thrown = true;
		}
		assertEquals("Comma Newline combination", true, thrown);
	}
	
	@Test
	public void testStringWithNumberCommaNumber() {
		String s = "1,2";
		StringCalculator SC = new StringCalculator();
		try {
			assertEquals(0, SC.add(s));
		}
		catch (Exception e) {
			//System.out.println(e.toString());
		}
	}
	
	@Test
	public void testStringWithNumberNewLineNewLineNumber() {
		String s = "1\n\n2";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			thrown = true;
		}
		assertEquals("2x Newline combination", true, thrown);
	}
	
	@Test
	public void testStringWithNumberCommaCommaNumber() {
		String s = "1,,2";
		StringCalculator SC = new StringCalculator();
		boolean thrown = false;
		try {
			SC.add(s);
		}
		catch (Exception e) {
			//System.out.println(e.toString());
			thrown = true;
		}
		assertEquals("2x comma combination", true, thrown);
	}

}
