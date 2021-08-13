package recursion_1;

public class CheckPalindrome {
	
	  public static boolean checkPalindrome(String input,int startIndex,int endIndex){
		    
		    if(startIndex >= endIndex){
		      return true;
		    }
		    if(input.charAt(startIndex) != input.charAt(endIndex)){
		      return false;
		    }
		    boolean ans = checkPalindrome(input,startIndex+1,endIndex-1);
		    return ans;
		  
		  }

		  public static boolean checkPalindrome(String input){
		    return checkPalindrome(input,0,input.length()-1);
		  
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("asa"));
	}

}
