package edu.mum.mscs.fpp.homework.practise;

public class TestProgram {

	public TestProgram() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		int MexPop = 114000000;
		int UniPop = 312000000;
		int count = 0;
		while(MexPop < UniPop){
			count ++;
			MexPop =(int) (MexPop + MexPop * 0.1001);
			System.out.println("Mexico population is: "+MexPop+" in "+(2015+count));
			UniPop = (int)(UniPop - UniPop * 0.0515);
			System.out.println("USA population is: "+UniPop+" in "+(2015+count));
		}
		System.out.println(2015+count);
	}


}
