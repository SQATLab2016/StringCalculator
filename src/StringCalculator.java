
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
		
		int value = 0;
		for (int i = 0; i < splitNumbers.length; i++)
			value += Integer.valueOf(splitNumbers[i].trim());
		
		return value;
	}
	
	private String reformatNewLines(String str) throws StringCalculatorException {
		int prevIndex = 0;
		
		while (prevIndex != -1) {
			prevIndex = str.indexOf('\n', prevIndex);
			
			if (prevIndex != -1 && prevIndex < str.length() - 1)
				prevIndex++;
			
			if (str.charAt(prevIndex) == ',')
				throw new StringCalculatorException();
		}
		
		return str.replaceAll("\n", ",");
	}
}
