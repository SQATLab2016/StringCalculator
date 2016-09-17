import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

  @Test
  public void testAddWithEmpty() {
    StringCalculator calc = new StringCalculator();

    String test = "";

    assertEquals(0, calc.add(test));
  }

  @Test
  public void testAddWithOne() {
    StringCalculator calc = new StringCalculator();

    String test = "1235";

    assertEquals(1235, calc.add(test));
  }

  @Test
  public void testAddWithTwo() {
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

  public void testAddUnknownWith5() {
    StringCalculator calc = new StringCalculator();

    String test = "213,500,2,45,3,10,2";

    assertEquals(775, calc.addUnknown(test));
  }
  
  public void testAddUnknownWith0() {
    StringCalculator calc = new StringCalculator();

    String test = "";

    assertEquals(0, calc.addUnknown(test));
  }
  
  public void testAddUnknownWith1() {
    StringCalculator calc = new StringCalculator();

    String test = "21313123";

    assertEquals(21313123, calc.addUnknown(test));
  }
}
