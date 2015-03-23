/**
 * 
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 */
public class Anagramming {

	public void anagram(String s) {
		anagram("", s);
	}

	private void anagram(String prefix, String s) {
		int N = s.length();
		if (N == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < N; i++)
				anagram(prefix + s.charAt(i),
						s.substring(0, i) + s.substring(i + 1, N));
		}

	}

	public void main(String[] args) {
		Anagramming a = new Anagramming();
		a.anagram("abc");
	}

}
