package fraction_class;

public class FractionClassUse {

	public static void main(String []args)  {
		
		FractionClass f1 = new FractionClass(20,30);
		f1.print();
		try {
			f1.setDenominator(0);
		}catch(ZeroDenominatorException e){
			System.out.println("Do Not Set Denominator as Zero");
		}
	
		FractionClass f2 = new FractionClass(30,20);
		f2.print();
		f1.add(f2);
		f1.print();
		f1.multiply(f2);
		f1.print();
		FractionClass f3 = FractionClass.add(f1, f2) ;
		f3.print();
		
	}
	
}
