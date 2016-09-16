import java.util.*;

public class StringCalculator {
	
	// only add two numbers with comma
	public int add(String numbersStr) throws StringCalculatorException {
		
		int sum = 0;
		
		// also throws exception when using negative numbers, because char '-' is not a number.
		if(numbersStr == null || numbersStr == "" || !isNumber(numbersStr, '\n', ',')) {
			//return 0;
			throw new StringCalculatorException();
		}
		
		// create an array of our string, splitting it with character ','.
		String[] numbers = numbersStr.split(",");
		
		// returns zero if there are more than two numbers.
		if(numbers.length > 3) {
			throw new StringCalculatorException();
		}
		
		for(String s : numbers) {
			sum += Integer.parseInt(s);
		}
		
		return sum;
		
	}
	
	// add unlimited amount with comma
	public int addUnlimited(String numbersStr) {
		int sum = 0;
		
		if(numbersStr == null || numbersStr == "" || !isNumber(numbersStr, '\n', ',')) {
			return 0;
		}
		
		// create an array of our string, splitting it with character ','.
		String[] numbers = numbersStr.split(",");
		
		for(String s : numbers) {
			sum += Integer.parseInt(s);
		}
		
		return sum;
	}
	
	// add unlimited + cut with newline and comma.
	public int addUsingNewline(String numbersStr) {
		
		int sum = 0;
		
		if(numbersStr == null || numbersStr == "" || !isNumber(numbersStr, '\n', ',')) {
			return 0;
		}
		
		// From this point forwards our string contains only numbers, newlines and commas.
		
		// create a new list, which contains our integers as characters. 
		List<Character> numbers = new ArrayList<Character>();
		
		// helper boolean
		boolean cutOnce = false;
		
		// cut our string using newline or comma.
		for(char c : numbersStr.toCharArray()) {
			if(c == '\n' || c == ',') {
				
				// if we have cut once already.
				// -> return zero, because it's not allowed to have two 
				// cuts in a row.
				if(cutOnce) {
					return 0;
				}
				
				cutOnce = true;
				continue;
			}
			
			cutOnce = false;
			numbers.add(c);
		}
		
		for(Character c : numbers) {
			sum += Integer.parseInt(c.toString());
		}
		
		return sum;
	}
	
	private boolean isNumber(String s, char cut1, char cut2) {
		
		for(char c : s.toCharArray()) {
			
			// change this to allow different char to split? 
			if(c == cut1 || c == cut2) {
				continue;
			}
			
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		
		return true;
	}
	
}
