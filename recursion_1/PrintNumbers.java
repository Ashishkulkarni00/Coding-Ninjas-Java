package recursion_1;
import java.util.Scanner;
public class PrintNumbers {
	
	public static void printNumbers(int N) {
		if(N == 1) {
			System.out.println(N);
			return;
		}
		System.out.println(N);
		printNumbers(N-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		printNumbers(N);
		
	}

}
