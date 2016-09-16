
public class StringCalculator {
	
	static final int[] validNumbers = {0, 1, 2};
	
	// Returns the sum of the numbers given in numbersStr
	public int add(String numbersStr) throws StringCalculatorException {
		int [] numbers;
		int result;
		
		if (numbersStr.length() == 0) {
			return 0;
		}
		
		numbers = StringArrayToInt(numbersStr.split(",|\\n"));
		result = calculateNumbers(numbers);
		
		return result;
	}
	
	private int[] StringArrayToInt(String[] strNumbers) throws StringCalculatorException {
		int[] intNumbers = new int[strNumbers.length];
		int tempInt;
		for (int i = 0; i < strNumbers.length; i++) {
			
			// Try converting part of the string to a integer
			try {
				tempInt = Integer.parseInt(strNumbers[i]);
			}
			catch(Exception e) {
				throw (new StringCalculatorException());
			}
			
			validateNumber(tempInt);
			intNumbers[i] = tempInt;
			
		}
		
		return intNumbers;
	}
	
	private void validateNumber(int number) throws StringCalculatorException {
		for (int i: validNumbers) {
			if (i == number) {
				return;
			}
		}
		throw (new StringCalculatorException());
	}
	
	private int calculateNumbers(int[] numbers) {
		int sum = 0;
		for (int x: numbers) {
			sum += x;
		}
		return sum;
	}

}
