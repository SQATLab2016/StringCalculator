
public class StringCalculator {
	public int add(String numbersStr) {
		if (numbersStr == null || numbersStr.length() == 0)
			return 0;
		
		try {
			numbersStr = reformatNewLines(numbersStr);
		} catch (StringCalculatorException sce) {
			return -1;
		}
		
		String[] splitNumbers = numbersStr.split(",");
		for (int i = 0; i < splitNumbers.length; i++)
			splitNumbers[i] = splitNumbers[i].trim();
		
		try {
			checkValidity(splitNumbers);
		} catch (StringCalculatorException sce) {
			return -1;
		}
		
		int value = 0;
		for (int i = 0; i < splitNumbers.length; i++)
			value += Integer.valueOf(splitNumbers[i]);
		
		return value;
	}
	
	private String reformatNewLines(String str) throws StringCalculatorException {
		int prevIndex = 0;
		
		while (prevIndex != -1) {
			prevIndex = str.indexOf('\n', prevIndex);
			
			if (prevIndex == -1)
				break;
			
			if (prevIndex < str.length() - 1 &&
				(str.charAt(prevIndex + 1) == ',' || str.charAt(prevIndex - 1) == ',')
				throw new StringCalculatorException();
			
			prevIndex++;
		}
		
		return str.replaceAll("\n", ",");
	}
	
	private void checkValidity(String[] strings) throws StringCalculatorException {
		for (int i = 0; i < strings.length; i++) {
			try {
				int converted = Integer.parseInt(strings[i]);
				
				if (converted < 0)
					throw new StringCalculatorException();
			} catch (NumberFormatException nfe) {
				throw new StringCalculatorException();
			}
		}
	}
}
