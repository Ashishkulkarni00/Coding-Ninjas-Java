package recursion_1;

public class ReplacePi {
	
	public static String replacePi (String input){
	    if(input.length() == 1){
	      return input;
	    }
	    String output = "";
	    String ans = replacePi(input.substring(1));
	    
	    if(ans.charAt(0) == 'i' && input.charAt(0) == 'p'){
	      output = "3.14"+ans.substring(1);
	      return output;
	    }else {
	    output = input.charAt(0) + ans;
	    return output;
	    }
	  
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replacePi("pipiashishpi"));
	}

}
