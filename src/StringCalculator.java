
public class StringCalculator {
	public static int add(String numbersStr) {
		// Returns 0 for an empty string
		if (numbersStr == "") {
			return 0;
		}
		
		// Returns the same number when given only one number
		if (numbersStr.matches("^\\d+$")) {
			return Integer.parseInt(numbersStr);
		}
		
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}
}
