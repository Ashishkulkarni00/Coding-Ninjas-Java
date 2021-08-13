package recursion_1;

public class GeometricSum {

	public static double geometricSum(int k){
	    if(k == 0){
	      return 1;
	    }
	    double ans = geometricSum(k-1);
	    return (ans+(1/(Math.pow(2,k))));
	  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(geometricSum(3));
	}

}
