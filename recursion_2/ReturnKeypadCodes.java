package recursion_2;

public class ReturnKeypadCodes {

	public static String helper(int N) {
		String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == (N - 2)) {
				temp = arr[i];
				break;
			}
		}
		return temp;
	}

	public static String[] keypadCode(int N) {

		if (N == 0) {
			String arr[] = { "" };
			return arr;
		}
		int lastDigit = N % 10;
		int remain = N / 10;
		String ans[] = keypadCode(remain);
		String option = helper(lastDigit);
		String ans1[] = new String[ans.length * option.length()];
		int k = 0;
		for (int i = 0; i < option.length(); i++) {
			for (int j = 0; j < ans.length; j++) {
				ans1[k] = option.charAt(i) + ans[j];
				k++;
			}
		}
		return ans1;

	}

}
