package recursion_2;

public class QuickSort {
	public static int partition(int input[], int startIndex, int endIndex) {
		int pivot = input[startIndex];
		int i = startIndex;
		int j = endIndex;
		while (i < j) {
			while (input[i] <= pivot && i < j) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		int temp = input[j];
		input[startIndex] = temp;
		input[j] = pivot;
		return j;
	}

	public static void Sort(int input[], int startIndex, int endIndex) {
		if (startIndex >= endIndex)
			return;
		int pivotPosition = partition(input, startIndex, endIndex);
		Sort(input, startIndex, pivotPosition - 1);
		Sort(input, pivotPosition + 1, endIndex);
	}
}
