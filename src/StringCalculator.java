//possibly misunderstood the task, unsure if it was supposed to add only one digit numbers, like I did or are numbers like 231 ok
//not finished anyway




import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	private List<Integer> numbers = new ArrayList<>();
	public int add(String numbersStr) throws StringCalculatorException{
		if(checkIfStringContainsOnlyNumbersAndAcceptableCharacters(numbersStr) && checkIfCharacterIsANumber(numbersStr.charAt(0))) {
			int counter = 0;
			for(char c: numbersStr.toCharArray()) {
				if(counter%2 == 0) {
					if (checkIfCharacterIsANumber(c)) {
						numbers.add(Character.getNumericValue(c));
					}
					else {
						throw new StringCalculatorException("String contains too many 'break' characters in a row");
					}
				}
				counter++;
			}
			int result = 0;
			for(int r: numbers) {
				result += r;
			}
			return result;
		}
		else {
			throw new StringCalculatorException("String contains more than just numbers");
		}
		//
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
