/**
 * RecursiveBinarySearch.java
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 * Perform binary search using recursive method
 * 
 * @author janardhanbonu
 *
 */
public class RecursiveBinarySearch {

	public static void main(String[] args) {
        
        int[] ints = {3,5,14,15,35,80,91,99};
        int index = binarySearch(ints,35,0,ints.length);
        System.out.println("Found 35 at "+index+" index");
        index = binarySearch(ints,80,0,ints.length);
        System.out.println("Found 80 at "+index+" index");
        index = binarySearch(ints,15,0,ints.length);
        System.out.println("Found 15 at "+index+" index");
    }
	
	public static int binarySearch(int[] ints, int searchNum, int iStart, int iEnd) {
        
        if (iStart < iEnd) {
            int mid = iStart + (iEnd - iStart) / 2; 
            if (searchNum < ints[mid]) {
                return binarySearch(ints, searchNum, iStart, mid);
                 
            } else if (searchNum > ints[mid]) {
                return binarySearch(ints, searchNum, mid+1, iEnd);
                 
            } else {
                return mid;  
            }
        }
        return iStart; 
    }

}
