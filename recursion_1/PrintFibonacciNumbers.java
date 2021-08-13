package recursion_1;
import java.util.*;
public class PrintFibonacciNumbers {
	static int N1 = 0,N2 = 1,ans = 0; 
	public static void printFib(int N) {
		
		if(N>=0) {
			ans = N1+N2;
			System.out.println(ans);
			N1 = N2;
			N2 = ans;
			printFib(N-1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		System.out.println(0);
		System.out.println(1);
		printFib(N-2);
	}

}
