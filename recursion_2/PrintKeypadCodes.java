package recursion_2;

public class PrintKeypadCodes {

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

	public static void print(int N, String output) {
		if (N == 0) {
			System.out.println(output);
		}
		int lastDigit = N % 10;
		int remain = N / 10;
		String option = helper(lastDigit);
		for (int i = 0; i < option.length(); i++) {
			print(remain, output + option.charAt(i));
		}
	}

}
