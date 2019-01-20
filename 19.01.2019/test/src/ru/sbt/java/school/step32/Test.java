package ru.sbt.java.school.step32;

public class Test{
	static boolean a;
	static boolean b;
	static boolean c;
	public static void main (String[] args){
		boolean bool = (a = true) || (b = true) && (c = true);
		System.out.print(a + ", " + b + ", " + c);
	}
}





































//      1. true, false, true
//		2. true, true, false
//		3. true, false, false +
//		4. true, true, true
