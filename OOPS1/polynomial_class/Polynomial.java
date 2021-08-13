package polynomial_class;
//class to represent Polynomial Using Dynamic Array
public class Polynomial {

	int max=0;
  	int coef[];

  	public Polynomial() {
  		coef = new int[5];
  	}
  	private void restructure() {
  		int temp[] = coef; 
  		coef = new int[2*coef.length];
  		for(int i=0;i<temp.length;i++) {
  			coef[i] = temp[i];
  		}
  	}
  	public void setCoefficient(int degree, int coeff){
		if(degree>=coef.length) {
    	  max = degree;
    	  restructure(); 
    	  coef[degree] = coeff;
      }else {
    	  coef[degree] = coeff;
     }
	}
	public void print() {
		for(int i=0;i<max;i++)
        {
          if(coef[i]!=0)
          {
            System.out.print(coef[i]+"x"+i+" ");
          }
        }
	}
	public Polynomial add(Polynomial p){
	 int max1 = this.max;
     int max2 = p.max;
      	if(max1<max2) {
      		for(int i=0,j=0;i<=max2&&j<max1;i++,j++)
      			{
      				this.coef[i]+=p.coef[j];
      			}
      	}else {
      			for(int i=0,j=0;i<=max2&&j<=max1;i++,j++)
      			{
      				p.coef[i]+=this.coef[j];
      			}
      	}
      	int temp = Math.max(max1,max2);
      	int arr[] = new int[temp+1];
      	for(int i=0;i<=temp;i++) {
      		if(max1<max2) {
      			arr[i] = this.coef[i];
      		}else {
      			arr[i] = p.coef[i];
      		}
      	}
      	
      this.max = arr.length;
      this.coef = arr;
      return this;
	}
	
	public Polynomial subtract(Polynomial p){
	 
		int max1 = this.max;
		int max2 = p.max;
		if(max1>max2) {
			for(int i=0,j=0;i<=max1&&j<=max2;i++,j++) {
				this.coef[i] -= p.coef[j];
			}
		}else {
			for(int i=0,j=0;i<=max1&&j<=max2;i++,j++) {
				p.coef[i] -= this.coef[j];
			}
		}
		int temp = Math.max(max1, max2);
		int arr[] = new int[temp+1];
		for(int i=0;i<=temp;i++) {
			if(max1>max2) {
				arr[i] = -(this.coef[i]);
			}else {
				arr[i] = -(p.coef[i]);
			}
		}
		this.max = arr.length;
		this.coef = arr;
		return this;
		
		
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){

		int max1 = this.max;
		int max2 = p.max;
		int arr[] = new int[max1+max2+1];
      	for(int i=0;i<=max2;i++)
        	{
             	 for(int j=0;j<=max2;j++)
                  {
						if(this.coef[i] != 0 && p.coef[j] != 0)
                        {
                          arr[i+j]+=this.coef[i]*p.coef[j];
                        }
                  }
            }
      this.max = arr.length;
      this.coef=arr;
      return this;
	}  
    

}

