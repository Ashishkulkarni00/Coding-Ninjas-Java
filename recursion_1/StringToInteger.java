package recursion_1;

public class StringToInteger {

	 public static int stringToInteger(String input){
		    
		    if(input.length() == 1){
		      int a = input.charAt(0) - '0';
		      return a;
		    }
		    int ans = stringToInteger(input.substring(1));
		    int num = input.charAt(0) - '0';
		    int output = (int)(num*Math.pow(10,input.length()-1)+ans);
		    return output;
		  }

	public static void main (String args[]) {
		System.out.println(stringToInteger("1124"));
	}
}
