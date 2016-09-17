
public class StringCalculator {
  public int add(String str) {
    // Returns the sum of the numbers given in numbersStr
    if (str.equals(""))
      return 0;
    int commaIndex = -1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 44)
        commaIndex = i;
    }

    // If no commas, i.e. only one number
    if (commaIndex == -1)
      return Integer.parseInt(str);
    // Two numbers.
    else {
      String str1 = str.substring(0, commaIndex);
      String str2 = str.substring(commaIndex + 1);
      int num1 = Integer.parseInt(str1);
      int num2 = Integer.parseInt(str2);
      return num1 + num2;
    }
  }

  // TODO: Complete method
  public int addUnknown(String str) {
    int commaCount = countCommas(str);
    int result = 0;
    if (commaCount < 2)
      return add(str);
    else {
      String numberStr = "";
      for (int i = 0; i < str.length(); i++) {
        String current = str.substring(i,i+1);
        if(current != ",")
          numberStr += current;
        else{
          result += Integer.parseInt(numberStr);
        }
      }
      return result;
    }
  }
  
  public int addWithNewLines(String str){
    int result = 0;
    String numberStr = "";
    for (int i = 0; i < str.length(); i++) {
      String current = str.substring(i,i+1);
      if(current != "," || current != "\n")
        numberStr += current;
      else{
        result += Integer.parseInt(numberStr);
      }
    }
    return result;
  }
  
  public int countCommas(String str) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ',')
        counter++;
    }
    return counter;
  }
}
