
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException{
		if(checkIfStringContainsNumbers(numbersStr)) {
			return 0;
		}
		else {
			throw new StringCalculatorException("String contains more than just numbers");
		}
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		
	}
	
	private boolean checkIfStringContainsNumbers(String s) {
		for(char c: s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
