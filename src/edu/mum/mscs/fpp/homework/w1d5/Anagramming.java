/**
 * Anagramming.java
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 * 5.	Find the permutations of given word using recursion.(Anagramming)
	Example : Input : cat
		     Output : cat  cta  atc  act tca tac 
	Output: 
	abc
	acb
	bac
	bca
	cab
	cba

 */
public class Anagramming {

	public void anagram(String s) {
		anagram("", s);
	}

	private void anagram(String prefix, String s) {
		System.out.printf("Prefix: %s String : %s\n",prefix,s);
		int N = s.length();
		if (N == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < N; i++) {
				System.out.printf("Step i : %d\n",i);
				anagram(prefix + s.charAt(i),
						s.substring(0, i) + s.substring(i + 1, N));
			}
		}

	}

	public static void main(String[] args) {
		Anagramming a = new Anagramming();
		a.anagram("abcdef");
	}

}
