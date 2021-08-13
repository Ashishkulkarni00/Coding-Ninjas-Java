package recursion_1;

public class PairStar {

	public static String pairStar(String input){
		if(input.length() == 1){
			return input;
		}
		String output = "";
		String ans = pairStar(input.substring(1));
		if(input.charAt(0) == ans.charAt(0)){
			output = input.charAt(0)+"*"+ans.charAt(0);
			return output+ans.substring(1);
		}
		return input.charAt(0)+ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pairStar("asdjfdssshii"));
	}

}
