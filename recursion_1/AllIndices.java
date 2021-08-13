package recursion_1;

public class AllIndices {

	public static int[] allIndices (int input[],int element,int startIndex){
	    if(startIndex >= input.length){
	      int arr[] = {};
	      return arr;
	    }
	    int ans[] = allIndices(input,element,startIndex+1);
	    if(input[startIndex] == element){
	      int ans1[] = new int[ans.length+1];
	      ans1[0] = startIndex;
	      for(int i=0;i<ans.length;i++) {
	    	  ans1[i+1] = ans[i];
	      }
	      return ans1;
	    }
	    return ans;
	  }
	
	  public static int[] allIndices (int input[],int element){
	    return allIndices(input,element,0);
	  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,3,4,51,1,1,5,1,6,1};
		int arr1[] = allIndices(arr,1);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}

}
