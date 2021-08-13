package recursion_1;

public class CountZeros {

	  public static int countZeros(int N){
		    if(N==0){
		      return 1;
		    }else if(N>0 && N<10){
		      return 0;
		    }
		    int ans = countZeros(N/10);
		    if(N%10 == 0){
		      return ans+1;
		    }
		    return ans;
		  
		  }

	
	public static void main(String[] args) {
		
		System.out.println(countZeros(1));

	}

}
