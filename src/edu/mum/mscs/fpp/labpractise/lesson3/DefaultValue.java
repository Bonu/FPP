/**
 * 
 */
package edu.mum.mscs.fpp.labpractise.lesson3;

/**
 * 
 * 1.	Create class called DefaultValue. Declare the data members for 
 * all primitive types. Write a method to display the default value of 
 * all the primitive type.
 * 
 * @author 984417
 *
 */
public class DefaultValue {

	byte by;
	short st;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean b;
	String s; // string is an object type but it is also treated as primitive type

	/**
	 * 
	 */
	public DefaultValue() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultValue dv = new DefaultValue();
		dv.displayDefaultValues();
		
	}
	
	/**
	 * ----Default values------
		byte :0
		short :0
		int :0
		long :0
		float :0.0
		double :0.0
		char :
	 */
	public void displayDefaultValues() {
		
		DefaultValue dv = new DefaultValue();
		
		System.out.println("--- Default values ------");
		System.out.println("byte :"+ dv.by);
		System.out.println("short :"+ dv.st);
		System.out.println("int :"+ dv.i);
		System.out.println("long :"+ dv.l);
		System.out.println("float :"+dv.f);
		System.out.println("double :"+dv.d);
		System.out.println("char :"+dv.c);
		System.out.println("boolean :"+dv.b);
		System.out.println("String :"+dv.s);
	}

}
