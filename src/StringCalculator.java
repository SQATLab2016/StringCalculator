
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException{
		if(checkIfStringContainsOnlyNumbersAndAcceptableCharacters(numbersStr) && checkIfFirstCharacterIsANumber(numbersStr)) {
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
			if(!Character.isDigit(c) || c != ',' || c != '\n') {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkIfFirstCharacterIsANumber(String s) {
		char[] c = s.toCharArray();
		if(Character.isDigit(c[0])) {
			System.out.println(c[0]);
			return true;
		}
		return false;
	}
}
