package recursion_1;

public class FirstIndexOfElementInArray {
	
	
		  public static int firstIndex(int input[],int startIndex,int element){
			    if(startIndex >= input.length){
			      return -1;
			    }
			    if(input[startIndex] == element){
			      return startIndex;
			    }
			    int ans = firstIndex(input,startIndex+1,element);
			    return ans;
		  }
		  
		  public static int firstIndex (int input[],int element){
			  int a = firstIndex(input,0,element);
			  return a;
		  }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println(firstIndex(arr,6));
	}

}
