package complex_class;

public class ComplexClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComplexClass C = new ComplexClass(4,5);
		C.print();
		ComplexClass C1 = new ComplexClass(5,4);
		C.add(C1);
		C.print();
		C1.print();
		ComplexClass C3 = ComplexClass.add(C,C1);
		C3.print();
		C3.subtract(C1);
		C3.print();
		ComplexClass C5 = C3.complexConjugate();
		C5.print1();
		
	}

}
