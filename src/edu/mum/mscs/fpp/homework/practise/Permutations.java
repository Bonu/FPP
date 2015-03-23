package edu.mum.mscs.fpp.homework.practise;


/**
 * Permuatations:
 * 
 * @author 984417
 *
 */
public class Permutations {

	private void anagram(String prefix, String s) {
		System.out.printf("Prefix: %s String : %s\n",prefix,s);
		int N = s.length();
		if (N == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < N; i++) {
				System.out.printf("Step i : %d\n  Prefix : %s  s.chartAt(i)  : %s s.substring(0, i) : %s   s.substring(i + 1, N) : %s \n" ,i,prefix, s.charAt(i),s.substring(0, i) , s.substring(i + 1, N));
				anagram(prefix + s.charAt(i),
						s.substring(0, i) + s.substring(i + 1, N));
			}
		}
	}

	public static void main(String[] args) {
		Permutations a = new Permutations();
		a.anagram("", "abcd");
	}
	
}
