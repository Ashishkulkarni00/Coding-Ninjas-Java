package recursion_1;

public class MultiplicationRecursive {

	 public static int multiply (int X,int N){
		  
		    if(N == 1){
		      return X;
		    }else if(N == 0){
		      return 0;
		    }
		    int ans = multiply(X,N-1);
		    return ans+X;
		  
		  }
	
	public static void main(String args[]) {
		
		System.out.println(multiply(5,4));
		
	}
}
