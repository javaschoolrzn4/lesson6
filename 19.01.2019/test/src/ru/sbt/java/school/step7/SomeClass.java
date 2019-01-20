package ru.sbt.java.school.step7;

class SomeClass{
	public static void main( String args[ ] ){
		if (args.length == 0 ){
			System.out.println("no arguments") ;
		}
		else{
			System.out.println( args.length + " arguments") ;
		}
	}
}





































//1. The program will fail to compile.
//2. The program will throw a NullPointerException when run with zero arguments.
//3. The program will print no arguments when called with zero arguments and 1 arguments when called with one
//argument. +
//4. The program will print no arguments and 2 arguments when called with zero and one arguments.
//5. The program will print no arguments and 3 arguments when called with zero and one arguments.