package recursion_1;

public class TowerOfHanoi {

	public static void TOH (int disks,char source,char auxiliary,char destination){
		  
	    if(disks == 0){
	     // System.out.println("Move from "+source+" to "+destination);
	      return;
	    }
	    TOH(disks-1,source,destination,auxiliary);
	    System.out.println("Move from "+source+" to "+destination);
	    TOH(disks-1,auxiliary,source,destination);
	  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TOH(3,'A','B','C');
	}

}
