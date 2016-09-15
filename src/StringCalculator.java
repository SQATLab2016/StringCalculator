
public class StringCalculator {
	private int[] numbers;
	public int add(String numbersStr) throws StringCalculatorException{
		if(checkIfStringContainsOnlyNumbersAndAcceptableCharacters(numbersStr) && checkIfCharacterIsANumber(numbersStr.charAt(0))) {
			return 0;
		}
		else {
			throw new StringCalculatorException("String contains more than just numbers");
		}
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		
	}
	
	private boolean checkIfStringContainsOnlyNumbersAndAcceptableCharacters(String s) {
		for(char c: s.toCharArray()) {
			if(!Character.isDigit(c) || c != ',' || c != '\n' || c == '-') {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkIfCharacterIsANumber(char c) {
		if(Character.isDigit(c)) {
			return true;
		}
		return false;
	}
}
