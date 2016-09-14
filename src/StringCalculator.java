
public class StringCalculator {
	public int add(String numbersStr) {
		if (numbersStr == null || numbersStr.length() == 0)
			return 0;
		
		String[] splitNumbers = new String[2];
		
		int value = 0;
		for (int i = 0; i < splitNumbers.length; i++)
			value += Integer.valueOf(splitNumbers[i]);
		
		return value;
	}
}
