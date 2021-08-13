package recursion_1;

public class RemoveX {

	public static String removeX (String input){
	    if(input.length() == 1){
	      if(input.charAt(0) == 'x')
	        return "";
	      else
	        return input;
	    }
	    String ans = removeX(input.substring(1));
	    if(input.charAt(0) == 'x'){
	      return ans;
	    }
	    return input.charAt(0)+ans;
	  }
	
	public static void main(String args[]) {
		
		System.out.println(removeX("xxqhfurhuzzxxxdfjfjxgokdofsx"));
		
	}
}
