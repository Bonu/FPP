/**
 * 
 */
package edu.mum.mscs.fpp.homework.w3d5;

/**
 * 1.	Initialize the array with following values.
	int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
	int denom[] = { 2, 0, 4, 4, 0, 8 };
	a.	write a code to divide numer[i] / denom[i].
	b.	Implement suitable exception for this code.
	
	Output:
		Numerator array:
		 4 8 16 32 64 128 256 512
		Denominator array:
		 2 0 4 4 0 8
		Numerator element to divide Denominator element: numer[1]/denom[1]
		result = 2
		result = 4
		result = 8
		result = 16
		ArithmeticException:java.lang.ArithmeticException: / by zero
		ArrayIndexOutOfBoundsException java.lang.ArrayIndexOutOfBoundsException: 6
		ArithmeticException:java.lang.ArithmeticException: / by zero
		ArrayIndexOutOfBoundsException java.lang.ArrayIndexOutOfBoundsException: 7
	
 * @author janardhanbonu
 *
 */
public class ArrayDivision {

	private int numer[];
	private int denom[];
	
	public ArrayDivision(){
		numer = new int[]{4, 8, 16, 32, 64, 128, 256, 512 };
		denom = new int[]{2, 0, 4, 4, 0, 8 };
	}
	
	public void divide(){
		int result = 0;
		for(int i=0; i<numer.length; i++){
			try{
				result = numer[i]/denom[i];
				System.out.println("result = "+result);
			}catch(ArithmeticException e){
				System.err.println("ArithmeticException:" +e);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException "+e);
			}
		}
	}
	
	public void display(int[] arr){
		for(int i:arr){
			System.out.printf(" %d",i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDivision dn = new ArrayDivision();
		System.out.println("Numerator array:");
		dn.display(dn.numer);
		System.out.println("\nDenominator array:");
		dn.display(dn.denom);
		System.out.println("\nNumerator element to divide Denominator element: numer[1]/denom[1]");
		dn.divide();
	}


}
