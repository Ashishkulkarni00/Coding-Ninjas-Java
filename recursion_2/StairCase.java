package recursion_2;

public class StairCase {

	public static int stairCase(int N) {
		if (N == 0) {
			return 1;
		} else if (N < 0) {
			return 0;
		}
		int x = stairCase(N - 1);
		int y = stairCase(N - 2);
		int z = stairCase(N - 3);
		return x + y + z;
	}

}
