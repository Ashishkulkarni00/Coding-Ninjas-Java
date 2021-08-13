package recursion_1;

public class SumOfDigits {

	 public static int sumOfDigits(int N){
	      if(N<10 && N>=0){
	        return N;
	      }
	      int ans = sumOfDigits(N/10);
	      return ans+N%10;
	    
	  
	  }
	
	public static void main(String args[]) {
		System.out.println(sumOfDigits(12345));
	}
}
