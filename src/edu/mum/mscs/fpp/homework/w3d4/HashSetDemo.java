package edu.mum.mscs.fpp.homework.w3d4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * HashSet Demonstration
 * 
 * output:
 *  ----Demonstrate insert operation----
	-----HashSet contains..[1, 2, 3, 4, 5, 6]
	----Demonstrate rejected addition of same object 3----
	--HashSet contains..[1, 2, 3, 4, 5, 6]
	----Demonstrate remove operation object 6----
	--HashSet contains..[1, 2, 3, 4, 5]
	----Demonstrate Iterator----
	1
	2
	3
	4
	5
 * @author janardhanbonu
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		System.out.println("----Demonstrate insert operation----");
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
		hSet.add(new Integer("4"));
		hSet.add(new Integer("5"));
		hSet.add(new Integer("6"));
		
		System.out.println("-----HashSet contains.." + hSet);
		System.out.println("----Demonstrate rejected addition of same object 3----");
		hSet.add(new Integer("3"));
		System.out.println("--HashSet contains.." + hSet);
		
		System.out.println("----Demonstrate remove operation object 6----");
		hSet.remove(new Integer("6"));
		System.out.println("--HashSet contains.." + hSet);
		
		System.out.println("----Demonstrate Iterator----");
		
		Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
		
	}
}