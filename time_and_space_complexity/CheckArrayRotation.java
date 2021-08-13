package time_and_space_complexity;

public class CheckArrayRotation {

	public static int checkRotation(int[] arr) {

		int min = Integer.MAX_VALUE;
		int minIndex = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;

	}

}
