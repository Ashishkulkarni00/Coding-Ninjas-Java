package recursion_1;

import java.util.Scanner;

public class CountDigits {
	
	public static int countDigits(int N) {
		
		if(N == 0) {
			return 0;
		}
		int ans = countDigits(N/10);
		return ans+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int N = input.nextInt();
		int ans = countDigits(N);
		System.out.println(ans);
	}

}
