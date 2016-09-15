
public class StringCalculator {
	public int add(String str) {
		// Returns the sum of the numbers given in numbersStr
		int result = 0;
		if (str.equals(""))
			return 0;
		
		else if (str.length() == 1){
			return Integer.parseInt(str);
		}
		
		else if (str.length() == 3){
			int num1 = Integer.parseInt(str.substring(0, 1));
			int num2 = Integer.parseInt(str.substring(2, 3));
		}
		// not yet implemented
		return result;
	}
}
