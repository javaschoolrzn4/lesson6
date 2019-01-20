package ru.sbt.java.school.step2;

class A{
	final int fi = 10;
}
public class B extends A{
	int fi = 15;
	public static void main(String[] args){
		B b = new B();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println( ( (A) b ).fi );
	}
}





































//Answer
//
//
//1. It will not compile.
//2. It will print 10 and then 10
//3. It will print 20 and then 20
//4. It will print 10 and then 20
//5. It will print 20 and then 10 - ok
