package edu.mum.mscs.fpp.homework.practise;

public class Permutations {

    // print N! permutation of the characters of the string s (in order)
    public  static void anagram(String s) { anagram("", s); }
    private static void anagram(String prefix, String s) {
        int N = s.length();
        if (N == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < N; i++)
            	anagram(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
        }

    }


    public static void main(String[] args) {
       
    	anagram("abc");
    }
}
