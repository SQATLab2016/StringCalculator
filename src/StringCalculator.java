
public class StringCalculator {
	
	// Returns the sum of the numbers given in numbersStr
	public int add(String numbersStr) throws StringCalculatorException {
		
		if (numbersStr.length() == 0) {
			return 0;
		}
		
		int[] numbers = StringArrayToInt(numbersStr.split(","));
		
		return 1;
	}
	
	private int[] StringArrayToInt(String[] strNumbers) throws StringCalculatorException {
		int[] intNumbers = new int[3];
		int tempInt;
		for (int i = 0; i < strNumbers.length; i++) {
			
			// Try converting part of the string to a integer
			try {
				tempInt = Integer.parseInt(strNumbers[i]);
			}
			catch(Exception e) {
				throw (new StringCalculatorException());
			}
			
			if (validateNumber(tempInt)) {
				intNumbers[i] = tempInt;
			}
			else {
				throw (new StringCalculatorException());
			}
			
		}
		
		return intNumbers;
	}
	
	private boolean validateNumber(int number) {
		// TODO add logic
		return true;
	}

}
