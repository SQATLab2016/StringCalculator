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
		String s = "2";
		StringCalculator SC = new StringCalculator();
		try {
			SC.add(s);
		}
		catch (Exception e) {
			boolean thrown = true;
			assertEquals("exception thrown", true, thrown);
		}
	}

}
