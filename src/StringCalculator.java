
public class StringCalculator {
	/**
	 * Returns the sum of the numbers given in numbersStr
	 */
	public static int add(String numbersStr) throws StringCalculatorException {
		// Returns 0 for an empty string
		if (numbersStr == "") {
			return 0;
		}
		
		// Returns the same number when given only one number
		if (numbersStr.matches("^\\d+$")) {
			return Integer.parseInt(numbersStr);
		}
		
		// Returns the sum of an unknown amount of numbers,
		// separated by commas or newlines
		if (numbersStr.matches(",\\n|\\n,")) {
			throw new StringCalculatorException("Can't have commas and newlines next to each other.");
		}
		if (numbersStr.matches("^\\d+[\\d,\\n]+\\d+$")) {
			String numbers[] = numbersStr.split(",+|\\n+");
			int sum = 0;
			for (String number : numbers) {
				sum += Integer.parseInt(number);
			}
			return sum;
		}
	}
}
