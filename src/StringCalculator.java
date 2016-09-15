
public class StringCalculator {
	public int add(String str) {
		// Returns the sum of the numbers given in numbersStr
		if (str.equals(""))
			return 0;
		int num1=0, num2=0;
		int commaIndex = -1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 44)
				commaIndex = i;
		}
		
		// If no commas, i.e. only one number
		if(commaIndex == -1)
			return Integer.parseInt(str);
		// Two numbers.
		else{
			
		}
		// not yet implemented
	}
}
