package recursion_2;

public class RemoveConsecutiveDuplicates {

	public static String removeDuplicates(String input) {
		if (input.length() == 1) {
			return input;
		}
		String ans = removeDuplicates(input.substring(1));
		if (input.charAt(0) != ans.charAt(0)) {
			ans = input.charAt(0)+ans;
		}
		return ans;
	}
	public static void main (String[] args) {
		String ans = removeDuplicates("aaaaaabbbbjfijdifjidfjiiiiib");
		System.out.println(ans);
	}

}
