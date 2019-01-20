package ru.sbt.java.school.step28;

public class ScopeTest{
	static int x = 5;
	public static void main(String[] args){
		int x = ( x=3 ) * 4; // 1
		System.out.println(x);
	}
}








































//1. It will not compile because line //1 cannot be parsed correctly.
//2. It will not compile because x is used before initialization.
//3. It will not compile because there is an ambiguous reference to x.
//4. It will print 12.+
//5. It will print 3.