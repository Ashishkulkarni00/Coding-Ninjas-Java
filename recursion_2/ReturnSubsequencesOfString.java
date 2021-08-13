package recursion_2;

public class ReturnSubsequencesOfString {

	public static String[] returnSubsequences(String input) {
		if (input.length() == 0) {
			String arr[] = { "" };
			return arr;
		}
		String ans[] = returnSubsequences(input.substring(1));
		String output[] = new String[2 * ans.length];
		int k = 0;
		for (int i = 0; i < ans.length; i++) {
			output[k] = ans[i];
			k++;
		}
		for (int i = 0; i < ans.length; i++) {
			output[k + i] = input.charAt(0) + ans[i];
		}
		return output;
	}

}
