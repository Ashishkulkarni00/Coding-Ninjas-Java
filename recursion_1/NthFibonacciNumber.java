package recursion_1;
import java.util.Scanner;
public class NthFibonacciNumber {
	
	public static int nthFibonacciNumber(int N) {
		
		if(N == 0 || N == 1)
			return N;
		int ans = nthFibonacciNumber(N-1)+nthFibonacciNumber(N-2);
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int ans = nthFibonacciNumber(N);
		System.out.println(ans);
	}

}
