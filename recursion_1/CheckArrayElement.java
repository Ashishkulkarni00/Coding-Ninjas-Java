package recursion_1;

public class CheckArrayElement {
	
	public static boolean checkElement(int input[],int element,int startIndex){
	    
	    if(startIndex >= input.length){
	      return false;
	    }
	    if(input[startIndex] == element)
	      return true;
	    boolean ans = checkElement(input,element,startIndex+1);
	    return ans;
	    
	  }
	  
	  public static boolean checkElement(int input[],int element){
	    return checkElement(input,element,0);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,0};
		System.out.println(checkElement(arr,9,0));

	}

}
