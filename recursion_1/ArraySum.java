package recursion_1;
import java.util.Scanner;
public class ArraySum {
	
	public static int sumOfArray (int input[],int startIndex){
		  if(startIndex>=input.length){
		    return 0;
		  }
		  int ans = sumOfArray(input,startIndex+1);
		  return ans+input[startIndex];

		}

		public static int sumOfArray (int input[]){

		  return sumOfArray(input,0);

		}
	
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		System.out.println(sumOfArray(arr));
			
		
	}
}
