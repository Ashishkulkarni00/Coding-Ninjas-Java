package recursion_2;

public class PrintSubSequences {

	public static void print(String input, String output) {
		if (input.length() == 0) {
			System.out.println(output);
			return;
		}
		print(input.substring(1), output);
		print(input.substring(1), input.charAt(0) + output);

	}
}
