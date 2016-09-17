import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

  @Test
  public void testAddWithEmpty() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "";

    assertEquals(0, calc.add(test));
  }

  @Test
  public void testAddWithOne() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "1235";

    assertEquals(1235, calc.add(test));
  }

  @Test
  public void testAddWithTwo() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "213,500";

    assertEquals(713, calc.add(test));
  }

  @Test
  public void testCountCommasWith1() {
    StringCalculator calc = new StringCalculator();

    String test = "213,500";

    assertEquals(1, calc.countCommas(test));
  }

  @Test
  public void testCountCommasWith4() {
    StringCalculator calc = new StringCalculator();

    String test = "213,500,2,0,1132";

    assertEquals(4, calc.countCommas(test));
  }
  
  @Test
  public void testAddUnknownWith7() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "213,500,2,45,3,10,2";

    assertEquals(775, calc.addUnknown(test));
  }
  
  @Test
  public void testAddUnknownWith0() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "";

    assertEquals(0, calc.addUnknown(test));
  }
  
  @Test
  public void testAddUnknownWith1() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "21313123";

    assertEquals(21313123, calc.addUnknown(test));
  }
  @Test
  public void testAddWithNewLineWith5() throws StringCalculatorException {
    StringCalculator calc = new StringCalculator();

    String test = "213,500\n2,45,3\n10,2";

    assertEquals(775, calc.addUnknown(test));
  }
  
  @Test
  public void testException() throws StringCalculatorException{
    
  }
}
