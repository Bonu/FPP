/**
 * 
 */
package edu.mum.mscs.fpp.homework.practise;

/**
 * @author janardhanbonu
 *
 */
public class LargestNumberInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] is = {2,1,5,4,7,4,8,9,3,6};
		
		int largest=0;
		int index = 0;
		
		for (int i = 0; i < is.length; i++) {
			if(largest < is[i]){
				largest = is[i];
				index = i;
			}
		}
		
		System.out.println(largest );
		System.out.println(index);

	}

}
