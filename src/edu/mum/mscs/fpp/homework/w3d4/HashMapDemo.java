/**
 * HashMapDemo.java
 */
package edu.mum.mscs.fpp.homework.w3d4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap Demonstration
 * 
 * Output:
 * 
 * {2=two, 4=four}

	Enumerate the HashMap
	Iterate through the HashMap
	key is: 2 & Value is: two
	key is: 4 & Value is: four
	
	Demonstrate access
	map.get( 2 ) = two
	map.get( 5 ) = null
	map = {2=two, 4=four}
	
	Show that duplicates cannot be added.
	Added 8.
	map = {2=two, 4=four, 8=eight}
	Could not add 4.
	map = {2=two, 4=FOUR, 8=eight}
	
	Demonstrate modification
	map = {2=two, 4=FOUR, 8=eight}

 * @author janardhanbonu
 */
public class HashMapDemo {
	  public static void main( String[] args )
	    {
	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    map.put( new Integer( 2 ), "two" );
	    map.put( new Integer( 4 ), "four" );
	    System.out.println( map );
	    System.out.println();

	    System.out.println( "Enumerate the HashMap" );
	    
	    System.out.println( "Iterate through the HashMap" );
	    Iterator iterator = map.entrySet().iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	    System.out.println();

	    System.out.println( "Demonstrate access" );
	    System.out.println( "map.get( 2 ) = " + map.get( new Integer( 2 ) ) );
	    System.out.println( "map.get( 5 ) = " + map.get( new Integer( 5 ) ) );
	    System.out.println( "map = " + map );
	    System.out.println();

	    System.out.println( "Show that duplicates cannot be added." );
	    Object value = map.put( new Integer( 8 ), "eight" );
	    if ( value != null )
	      System.out.println( "Could not add 8." );
	    else
	      System.out.println( "Added 8." );
	    System.out.println( "map = " + map );

	    value = map.put( new Integer( 4 ), "FOUR" );
	    if ( value != null )
	      System.out.println( "Could not add 4." );
	    else
	      System.out.println( "Added 4." );
	    System.out.println( "map = " + map );
	    System.out.println();

	    System.out.println( "Demonstrate modification" );
	    map.put( new Integer( 4 ), "FOUR" );
	    System.out.println( "map = " + map );
	    }
	  }
