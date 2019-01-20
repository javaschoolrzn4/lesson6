package ru.sbt.java.school.step38;

public class TestClass{
	static boolean b;
	static int[] ia = new int[1];
	static char ch;
	static boolean[] ba = new boolean[1];
	public static void main(String args[]) throws Exception{
		boolean x = false;
		if( b ){
			x = ( ch == ia[ch]);
		}
		else x = ( ba[ch] = b );
		System.out.println(x+" "+ba[ch]);
	}
}


































//1. true true
//2. true false
//3. false true
//4. false false +
//5. It will not compile.