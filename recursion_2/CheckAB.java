package recursion_2;

public class CheckAB {

	public static boolean checkAB(String input) {
		if (input.length() == 0)
			return true;
		if (input.charAt(0) == 'a') {
			if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb")) {
				boolean ans = checkAB(input.substring(3));
				return ans;
			} else {
				boolean ans = checkAB(input.substring(1));
				return ans;
			}
		}
		return false;
	}

}
