package complex_class;

public class ComplexClass {

	private int real;
	private int imaginary;
	
	public ComplexClass(int real,int imaginary) {
		this.imaginary = imaginary;
		this.real = real;
	}
	public int getReal() {
		return real;
	}
	public int gerImaginary() {
		return imaginary;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void print () {
		System.out.println(real + "+" +imaginary+"i");
	}
	public void print1 () {
		System.out.println(real+"-"+imaginary+"i");
	}
	
	public void add(ComplexClass C1) {
		this.real+=C1.real;
		this.imaginary+=C1.imaginary;
	}
	public void subtract(ComplexClass C1) {
		this.real-=C1.real;
		this.imaginary-=C1.imaginary;
	}
	public static ComplexClass add(ComplexClass C1,ComplexClass C2) {
		
		int newreal = C1.real+C2.real;
		int newimaginary = C1.imaginary+C2.imaginary;
		ComplexClass C3 = new ComplexClass(newreal,newimaginary);
		return C3;
	} 
	
	public void multiply(ComplexClass C) {
		int temp = this.real;
		int temp1 = this.imaginary;
		real = temp*C.real+temp*C.imaginary;
		imaginary = temp1*C.real+temp1*C.imaginary;
	}
	
	public static ComplexClass subtract(ComplexClass C1,ComplexClass C2) {
		
		int newreal = C1.real-C2.real;
		int newimaginary = C1.imaginary-C2.imaginary;
		ComplexClass C3 = new ComplexClass(newreal,newimaginary);
		return C3;
	}
	public ComplexClass complexConjugate () {
		
		int newimaginary =(this.imaginary);
		ComplexClass C = new ComplexClass(real,newimaginary);
		return C;
		
		
	}
	
}
