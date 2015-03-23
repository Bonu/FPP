/**
 * Palindrome.java
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 * 2. Check whether the given string is palindrome or not
 * 
 * Example: madam - Palindrome
 * 			jackson - Not Palindrome
 * 
 * Output:
 *  String Sahara is Not Palindrome
	String madam  is Palindrome
	String Madam  is Not Palindrome
	String rar    is Palindrome
	String maam   is Palindrome
 * 
 * @author janardhanbonu
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Palindrome pal= new Palindrome();
		System.out.printf("String Sahara is %s\n",pal.isPalindrome("sahara")?"Palindrome":"Not Palindrome");
		System.out.printf("String madam  is %s\n",pal.isPalindrome("madam")?"Palindrome":"Not Palindrome");
		System.out.printf("String Madam  is %s\n",pal.isPalindrome("Madam")?"Palindrome":"Not Palindrome");
		System.out.printf("String rar    is %s\n",pal.isPalindrome("rar")?"Palindrome":"Not Palindrome");
		System.out.printf("String maam   is %s\n",pal.isPalindrome("maam")?"Palindrome":"Not Palindrome");
		
	}
	
	public boolean isPalindrome(String s){
		if(s.length() == 0 || s.length() == 1){
			return true;
		}else{
			 if(s.charAt(0) == s.charAt(s.length()-1))
				 return isPalindrome(s.substring(1, s.length()-1));
		}
		return false;
	}

}
