
public class StringCalculator {
	public int add(String str) {
		// Returns the sum of the numbers given in numbersStr
		if (str.equals(""))
			return 0;
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
			String str1 = str.substring(0, commaIndex);
			String str2 = str.substring(commaIndex+1);
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			return num1 + num2;
		}
		// not yet implemented
	}
	
	public int countCommas(String str){
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			
		} 
	}
}
