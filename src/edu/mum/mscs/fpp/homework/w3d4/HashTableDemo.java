/**
 * 
 */
package edu.mum.mscs.fpp.homework.w3d4;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 * HashTable demonstration
 * 
 * Output: 
 * -------------Insert operation---------
	-----Get Value for ky Nestle-----
	------Operation containsKey check for contains Google as key: false
	------Does hashtable -------containsValues---- Japan as value: true
	-----------Enumeration----------------
	hashtable values: India
	hashtable values: Germany
	hashtable values: Switzerland
	hashtable values: SouthKorea
	hashtable values: Japan
	------IsEmpty ---- companies hashtable empty: false
	--------Size ----- of hashtable in Java: 5

 * @author janardhanbonu
 *
 */
public class HashTableDemo {

	public static void main(String args[]) {

		Hashtable<String, String> employer = new Hashtable<String, String>();
		
		System.out.println("-------------Insert operation---------");
		employer.put("Samsung", "SouthKorea");
		employer.put("Nestle", "Switzerland");
		employer.put("Siemens", "Germany");
		employer.put("Sony", "Japan");
		employer.put("TCS", "India");
		System.out.println("-----Get Value for key Nestle-----");
		employer.get("Nestle");

		System.out.println("------Operation containsKey check for contains Google as key: "
				+ employer.containsKey("Google"));

		System.out.println("------Does hashtable -------containsValues---- Japan as value: "
				+ employer.containsValue("Japan"));

		System.out.println("-----------Enumeration----------------");
		Enumeration enumeration = employer.elements();

		while (enumeration.hasMoreElements()) {
			System.out.println("hashtable values: " + enumeration.nextElement());
		}

		System.out.println("------IsEmpty ---- companies hashtable empty: "
				+ employer.isEmpty());

		System.out.println("--------Size ----- of hashtable in Java: " + employer.size());

		Set hashtableKeys = employer.keySet();

		Enumeration hashtableKeysEnum = employer.keys();

		Enumeration hashtableValuesEnum = employer.elements();

		Collection hashtableValues = employer.values();

	}
}
