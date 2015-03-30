/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d4;

import java.util.Arrays;

/**
 * 1. Create an outer class with a data member for an Integer array. Create an inner 
 * class to identify the minimum, maximum, average value of the integer array.
 * 
 * @author 984417
 *
 */
public class OuterClass {
	
	private int[] ints = {72,26,33,48,53,63,67,83,69,14};

	public OuterClass() {
		// TODO Auto-generated constructor stub
	}
	
	public class InnerClass{
		
		public int maxArray(){
			// Linear search
			int max = 0;
			for (int i : ints) {
				if(max < i){
					max = i;
				}
			}
			return max;
		}
		
		public int minArray(){
			// Linear search
			int min = ints[0];
			for (int i : ints) {
				if(min > i){
					min = i;
				}
			}
			return min;
		}
		
		public int avgArray(){
			int total = 0;
			for (int i : ints) {
				total = total + i;
			}
			return total/ints.length;
		}
		
	}
	
	public static void main(String[] args) {

		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		
		System.out.println("Max value in an array : "+ic.maxArray());
		System.out.println("Min value in an array : "+ic.minArray());
		System.out.println("Average of the int array : "+ic.avgArray());
		
	}

	
}
