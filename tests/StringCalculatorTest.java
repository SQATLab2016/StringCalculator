import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAddWithEmpty() {
		StringCalculator calc = new StringCalculator();
		
		String test="";
		
		assertEquals(0, calc.add(test));
	}
	
	@Test
	public void testAddWithOne() {
		StringCalculator calc = new StringCalculator();
		
		String test="1235";
		
		assertEquals(1235, calc.add(test));
	}
	
	@Test
	public void testAddWithOne() {
		StringCalculator calc = new StringCalculator();
		
		String test="213,500";
		
		assertEquals(713, calc.add(test));
	}
}
