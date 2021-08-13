package recursion_1;

public class LastIndexOfNumber {

	
	public static int lastIndex(int input[],int element,int startIndex){
	    if(startIndex >= input.length){
	      return -1;
	    }
	    int ans = lastIndex(input,element,startIndex+1);
	    if(ans == -1){
	      if(input[startIndex] == element)
	        return startIndex;
	      else
	        return -1;
	    }
	    return ans;
	  }
	  public static int lastIndex(int input[],int element){
	    return lastIndex(input,element,0);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,2,3,11,4,7,3};
		System.out.println(lastIndex(arr,11));
	}

}
