package fraction_class;



public class FractionClass {
	//Class data members
	private int numerator;
	private int denominator;
	
	//Constructor to initialize data members
	public FractionClass (int numerator,int denominator){
		
		this.numerator = numerator;
		if(denominator == 0) { 
			//TODO error out
		}else {
			this.denominator = denominator;
			
		}
		//Simplify Method For Simplification of Fraction
		simplify();
		
	}
	//Print method to print out output in required format
	public void print() {
		if(denominator == 1) {
			System.out.println(numerator);
		}else {
			System.out.println(numerator+"/"+denominator);
		}
	}
	//Method to set the numerator
	public void setNumerator (int numerator) {
		this.numerator = numerator;
		simplify();
	}
	//Method to set Denominator
	public void setDenominator(int denominator) throws ZeroDenominatorException{
		if(denominator == 0) {
			ZeroDenominatorException e = new ZeroDenominatorException();
			throw e;
		}
		else {
			this.denominator = denominator;
		}
		//Every time Numerator or Denominator changes we have to call Simplify method
		simplify();
	}
	//Method to return the Denominator
	public int getDenominator() {
		return denominator;
	}
	//Method to return Numerator
	public int getNumerator() {
		return numerator;
	}
	//Simplify Method
	private void simplify () {
		//To simplify the fraction we calculate GCD and divide to both Numerator & Denominator
		//Keep GCD as 1 not Zero because if numerator and denominator do not have common divisor,
		//In that case 1 must be GCD
		int gcd = 1;
		//TO calculate GCD start from 2 till the Smallest among Numerator and Denominator
		int smaller = Math.min(numerator, denominator);
		for(int i=2;i<=smaller;i++) {
			
			if(numerator % i == 0 && denominator%i == 0)
				gcd = i;
		}
		//After finding GCD Divide numerator and Denominator by GCD
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	//Method to add two Fractions
	public void add (FractionClass f2) {
		//This Method will take one fraction as a argument and add in existing Fraction
		//and assign new value of fraction in the existing Fraction
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	//Method to multiply two Fractions
	public void multiply (FractionClass f2) {
		
		this.numerator = this.numerator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	//Static method to add two Fractions 
	//This method takes two fractions as arguments and add and stores in third object
	//then returns the third object
	public static FractionClass add (FractionClass f1,FractionClass f2) {
		
		int newnum = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
		int newden = f1.denominator*f2.denominator;
		FractionClass f = new FractionClass(newnum,newden);
		return f;
	}
}
