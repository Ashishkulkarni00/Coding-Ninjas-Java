package recursion_2;

public class MergeSort {

	public static void merge(int input[], int startIndex, int mid, int endIndex) {
		int arr1[] = new int[mid - startIndex + 1];
		int arr2[] = new int[endIndex - mid];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input[startIndex + i];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = input[(mid + 1) + j];
		}
		int i = 0;
		int j = 0;
		int k = startIndex;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				input[k] = arr1[i];
				i++;
			} else {
				input[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			input[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			input[k] = arr2[j];
			j++;
			k++;
		}

	}

	public static void sort(int input[], int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int mid = (startIndex + endIndex) / 2;
		sort(input, startIndex, mid);
		sort(input, mid + 1, endIndex);
		merge(input, startIndex, mid, endIndex);

	}
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
