package recursion_1;
import java.util.Scanner;
public class Findpower {
	
	
	public static int findPower(int X,int N) {
		
		if(N == 0) {
			return 1;
		}
		int ans = findPower(X,N-1);
		return X*ans;
		
	}

	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int X = input.nextInt();
		int N = input.nextInt();
		int ans = findPower(X,N);
		System.out.println(ans);
	}
	
	
}
