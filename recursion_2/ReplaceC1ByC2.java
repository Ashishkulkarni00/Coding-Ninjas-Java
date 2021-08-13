package recursion_2;

public class ReplaceC1ByC2 {

	public static String replace(String input, char C1, char C2) {
		if (input.length() == 0) {
			return "";
		}
		String ans = replace(input.substring(1), C1, C2);
		if (input.charAt(0) == C1) {
			ans = C2 + ans;
			return ans;
		} else {
			return input.charAt(0) + ans;
		}
	}

}
