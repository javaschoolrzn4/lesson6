package ru.sbt.java.school.step11;

public class Test{
	public static void main(String[ ] args){
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System.out.println( a [ (a = b)[3] ] );
	}
}









































//1. It will not compile.
//2. It will throw ArrayIndexOutOfBoundsException when run.
//3. It will print 1. +
//4. It will print 3.
//5. It will print 4



