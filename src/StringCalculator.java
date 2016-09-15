import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	private List<Integer> numbers = new ArrayList<>();
	public int add(String numbersStr) throws StringCalculatorException{
		if(checkIfStringContainsOnlyNumbersAndAcceptableCharacters(numbersStr) && checkIfCharacterIsANumber(numbersStr.charAt(0))) {
			int counter = 0;
			int skip = 0;
			for(char c: numbersStr.toCharArray()) {
				if(counter%2 == 0) {
					if(c =='\n') {
						counter++; //windows specific solution, newline "\n" is treated as two characters, \r \n
						skip++;
						if(skip > 1) {
							throw new StringCalculatorException("String contains too many newline characters in a row");
						}
					}
					else if (checkIfCharacterIsANumber(c)) {
						numbers.add(Character.getNumericValue(c));
						skip = 0;
					}
					else {
						throw new StringCalculatorException("String contains too many 'break' characters in a row");
					}
				}
				counter++;
			}
			
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
			if(!Character.isDigit(c)) {
				if(c == ',' || c == '\r' || c == '\n') {
					
				}
				else {
					return false;
				}
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
