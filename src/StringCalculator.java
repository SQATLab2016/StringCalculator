
public class StringCalculator {
	public int add(String numbersStr) {
		if (numbersStr == null || numbersStr.length() == 0)
			return 0;
		
		numbersStr = reformatNewLines(numbersStr);
		
		String[] splitNumbers = numbersStr.split(",");
		
		int value = 0;
		for (int i = 0; i < splitNumbers.length; i++)
			value += Integer.valueOf(splitNumbers[i].trim());
		
		return value;
	}
	
	private String reformatNewLines(String str) throws StringCalculatorException {
		int prevIndex = 0;
		
		while (prevIndex != -1) {
			prevIndex = str.indexOf("\n", prevIndex);
			
			if (str.charAt(prevIndex + 1) == ',')
				throw new StringCalculatorException();
		}
		
		return str.replaceAll("\n", ",");
	}
}
