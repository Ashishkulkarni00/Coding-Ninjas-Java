package time_and_space_complexity;

public class RotateArray {
	public static void reverseArray(int[] arr, int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
	public static void rotateArray(int[] arr, int d) {

		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		} 
		for (int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}
		int k = 0;
		for (int i = arr.length - d; i < arr.length; i++) {
			arr[i] = temp[k++];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotateArray(arr, 2);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
